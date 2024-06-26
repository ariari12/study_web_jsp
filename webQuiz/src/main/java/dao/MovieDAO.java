package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.EmpVO;
import vo.MovieVO;

public class MovieDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public MovieDAO(){
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
	
	public MovieVO selectMovie(String name) {
		MovieVO vo = null;
		sb.setLength(0);
		sb.append("SELECT img ");
		sb.append("FROM movie ");
		sb.append("WHERE name=? ");
		try {
			System.out.println(name);
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, name);
			rs=pstmt.executeQuery();
			if(rs.next()) {		
				
				String img=rs.getString("img");
				System.out.println(img);
				vo = new MovieVO();
				vo.setName(name);
				vo.setImg(img);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public void insertMovie(String name,String filename) {		
		sb.setLength(0);
		sb.append("INSERT INTO movie ");
		sb.append("VALUES(?,?) ");	
		try {			
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, filename);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
