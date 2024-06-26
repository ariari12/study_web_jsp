package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.EmpVO;

public class EmpDAO {
	//환경변수
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	StringBuffer sbf = new StringBuffer();
	EmpVO evo=null;
	
	public EmpDAO() {
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<EmpVO> selectAll() {
		sbf.setLength(0);
		sbf.append("select empno, ename, job, mgr, hiredate, sal, comm, deptno ");
		sbf.append("from emp");
		ArrayList<EmpVO> empList = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sbf.toString());
			rs =pstmt.executeQuery();			
			while(rs.next()) {
				evo=new EmpVO(rs.getInt("empno"),
						rs.getString("ename"),
						rs.getString("job"),
						rs.getInt("mgr"),
						rs.getDate("hiredate"),
						rs.getInt("sal"),
						rs.getInt("comm"),
						rs.getInt("deptno"));
				empList.add(evo);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
		
	}
	
	public ArrayList<vo.EmpDeptVO> selectAllV2(){
		sbf.setLength(0);
		sbf.append("select e.empno,e.ename, e.sal,d.deptno, d.dname,d.loc from dept d,emp e where d.deptno=e.deptno");
		ArrayList<vo.EmpDeptVO> list = new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(sbf.toString());
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				vo.EmpDeptVO edvo = new vo.EmpDeptVO(empno,ename,sal,deptno,dname,loc);
				list.add(edvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<vo.EmpDeptVO> selectDeptNo(int no){
		sbf.setLength(0);
		sbf.append("select e.empno,e.ename, e.sal,d.deptno, d.dname,d.loc from dept d,emp e where d.deptno=e.deptno and d.deptno=?");
		ArrayList<vo.EmpDeptVO> list = new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(sbf.toString());
			pstmt.setInt(1, no);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				vo.EmpDeptVO edvo = new vo.EmpDeptVO(empno,ename,sal,deptno,dname,loc);
				list.add(edvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
