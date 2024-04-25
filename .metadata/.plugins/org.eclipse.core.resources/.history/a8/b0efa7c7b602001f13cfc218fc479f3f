package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.FileInfoVO;

public class FileInfoDAO {
	//1~3
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public FileInfoDAO() {
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			System.out.println("드라이버를 찾을 수 없습니다");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
		}
		
	}
	public ArrayList<FileInfoVO> selectAll(){
		sb.setLength(0);
		sb.append("SELECT fno, filePath, type, no ");
		sb.append("FROM fileinfo ");
		ArrayList<FileInfoVO> list = new ArrayList<FileInfoVO>();
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int fno=rs.getInt("fno");
				String filename=rs.getString("filename");
				String type=rs.getString("type");
				int no=rs.getInt("no");
				FileInfoVO fvo = new FileInfoVO();
				list.add(fvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public void addFileOne(String fileName, String type, int no) {
		sb.setLength(0);
		sb.append("INSERT INTO fileinfo ");
		sb.append("VALUES(fileinfo_fno_seq.nextval, ?,?,?) ");
		try {
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1, fileName);
			pstmt.setString(2, fileName);
			pstmt.setInt(3, no);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		
	}

}
