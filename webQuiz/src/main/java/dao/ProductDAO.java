package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.ProductVO;

public class ProductDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public ProductDAO(){
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
	
	public ArrayList<ProductVO> selectAll(){
		sb.setLength(0);
		sb.append("SELECT pno, pname, price, dcratio, prodesc, qty, imgfile ");
		sb.append("FROM product");
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		try {
			pstmt=conn.prepareStatement(sb.toString());
			rs=pstmt.executeQuery();
			while(rs.next()) {
				int pno = rs.getInt("pno");
				String pname = rs.getString("pname");
				int price = rs.getInt("price");
				int dcratio = rs.getInt("dcratio");
				String prodesc = rs.getString("prodesc");
				int qty = rs.getInt("qty");
				String imgfile = rs.getString("imgfile");
				ProductVO pvo =new ProductVO(pno,pname,price,dcratio,prodesc,qty,imgfile);
				list.add(pvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
