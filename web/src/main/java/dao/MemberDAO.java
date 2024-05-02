package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	
	public ArrayList<MemberVO> selectAll(){
		sb.setLength(0);
		sb.append("SELECT no, id, pw, name, gender, motive ");
		sb.append("from member ");
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		MemberVO vo=null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sb.toString());		
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				int no=rs.getInt("no");
				String userId=rs.getString("id");
				String userPw=rs.getString("pw");
				String name=rs.getString("name");
				String gender=rs.getString("gender");
				String motive=rs.getString("motive");
				vo = new MemberVO(no, userId,userPw,name,gender,motive);
				list.add(vo);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
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
				vo = new MemberVO(no, userId,userPw,name,gender,motive);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vo;	
	}
	
	public void addMember(MemberVO vo) {
		// sb 길이를 0으로 만들어서 초기화
		sb.setLength(0);
		// 4. sql문 작성
		// 내가 작성한 시퀀스의 정보는 DESC USER_SEQUENCES
		sb.append("INSERT INTO member values(MEMBER_NO_SEQ.nextval,?,?,?,?,?)");
		//5. 문장객체
		try {
			PreparedStatement pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPw());
			pstmt.setString(4, vo.getGender());
			pstmt.setString(5, vo.getMotive());
			
			//6. 실행
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public MemberVO getOne(String id) {
		sb.setLength(0);
		sb.append("SELECT no, id, pw, name, gender, motive ");
		sb.append("FROM member where id=? ");
		MemberVO vo=null;
		try {
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			if(rs.next()) {				
				String name=rs.getString("name");				
				vo = new MemberVO();
				vo.setId(id);
				vo.setName(name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
		
	}
	
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
