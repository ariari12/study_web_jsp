package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.MemberVO;

public class MemberDAO {
	//1. 환경변수
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public MemberDAO(){
		try {
			// 2.드라이버 로딩
			Class.forName(driver);
			//3. connection
			conn = DriverManager.getConnection(url,username,password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
		

		
	}
	public MemberVO searchUser(String id, String pw) {
		//4~7		
		sb.setLength(0);
		sb.append("SELECT no, id, pw, name, gender, motive ");
		sb.append("from member where id=? and pw=?");
		MemberVO vo=null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			pstmt.setString(2, pw);			
			rs =pstmt.executeQuery();
			
			if(rs.next()) {
				int no=rs.getInt("no");
				String userId=rs.getString("id");
				String userPw=rs.getString("pw");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String motive=rs.getString("motive");
				/* String zipcode=rs.getString("zipcode"); */
				vo = new MemberVO(no, userId, userPw,name,gender,motive);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;	
	}
	
	public void insertOne(MemberVO mvo) {
		sb.setLength(0);
		sb.append("INSERT INTO member values(MEMBER_NO_SEQ.nextval,?,?,?,?,?)");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, mvo.getId());
			pstmt.setString(2, mvo.getPw());
			pstmt.setString(3, mvo.getName());
			pstmt.setString(4, mvo.getGender());
			pstmt.setString(5, mvo.getMotive());
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
