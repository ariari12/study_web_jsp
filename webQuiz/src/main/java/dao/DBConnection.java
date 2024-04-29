package dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBConnection {
	
	private static DBConnection instance = new DBConnection();
	
	private DBConnection() {}
	
	public Connection getConnection() {	
		Context initCtx;
		Connection conn=null;
		try {
			initCtx = new InitialContext();
			//자원을 찾음 외부에서
			Context ctx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) ctx.lookup("myoracle");			
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}

	public static DBConnection getInstance() {
		return instance;
	}
	
	

}
