package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.EmpDeptVO;
import vo.EmpVO;

public class EmpDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();

	public EmpDAO() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<EmpDeptVO> selectAll(){
		sb.setLength(0);
		sb.append("select e.empno,e.ename, e.sal,d.deptno, d.dname,d.loc from dept d,emp e where d.deptno=e.deptno");
		ArrayList<EmpDeptVO> list = new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(sb.toString());
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				EmpDeptVO edvo = new EmpDeptVO(empno,ename,sal,deptno,dname,loc);
				list.add(edvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public EmpVO findByEmpno(int empno) {
		EmpVO vo = null;
		sb.setLength(0);
		sb.append("SELECT empno, ename, job,mgr,hiredate,sal,comm,deptno ");
		sb.append("FROM emp ");
		sb.append("WHERE empno=? ");
		try {
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setInt(1, empno);
			rs=pstmt.executeQuery();
			if(rs.next()) {			
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				vo = new EmpVO();
				vo.setEmpno(empno);
				vo.setEname(ename);
				vo.setJob(job);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
}
