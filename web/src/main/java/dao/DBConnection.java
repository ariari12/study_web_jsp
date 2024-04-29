package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.DeptVO;

public class DBConnection {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url ="jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "scott";
	private String password = "tiger";
	Connection conn=null;
	private static DBConnection instance = new DBConnection();
	
	private DBConnection() {		
	}

	public static DBConnection getInstance() {
		return instance;
	}
	
	public Connection getConnection() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("conn : "+conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
		
		return conn;
	}

}
