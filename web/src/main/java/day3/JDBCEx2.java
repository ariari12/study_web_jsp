package day3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//DAO(DATA Access Object)
public class JDBCEx2 {
	public static void main(String[] args) {
		// 목표 : 실행 ==> 사원 정보를 출력 부서번호 10인
		// 사원의 사번, 이름, 급여, 부서번호
		// 1. 환경변수
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String username = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 2. 드라이버로딩
		try {
			Class.forName(driver);
			// 3. Connection
			conn = DriverManager.getConnection(url,username,password);
			// 4. sql문장
			StringBuffer sb = new StringBuffer();
			String sql = "select empno,ename,sal,deptno,hiredate from emp where deptno=?";
			sb.append(sql);
			pstmt =conn.prepareStatement(sql);
			pstmt.setInt(1, 10);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int empno=rs.getInt("empno");				
				String dname=rs.getString("ename");
				int sal=rs.getInt("sal");
				int deptno =rs.getInt("deptno");
				Date hiredate =rs.getDate("hiredate");
				System.out.println(empno+" "+dname+" "+sal+" "+deptno+" "+hiredate);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		// 5. sql문장 객체
 
	}

}