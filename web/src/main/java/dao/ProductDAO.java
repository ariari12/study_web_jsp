package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.ProductVO;

public class ProductDAO {
	//1~3 기본 생성자
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url ="jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public ProductDAO() {
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	// 전체조회 : selectAll()
	public ArrayList<ProductVO> selectAll(){
		sb.setLength(0);
		sb.append("select pno, pname, price, dcratio, prodesc, qty, imgfile, bigfile from product");
		ArrayList<ProductVO> list=new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(sb.toString());
			rs=pstmt.executeQuery();			
			while(rs.next()) {
				ProductVO pvo =new ProductVO(
						rs.getInt("pno"),
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getInt("dcratio"),
						rs.getString("prodesc"),
						rs.getInt("qty"),
						rs.getString("imgfile"),
						rs.getString("bigfile")
						);
				list.add(pvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	//4~7
	
	// 1건 조회 : get One(int pno);
	
	public ProductVO getOne(int pno){
		sb.setLength(0);
		sb.append("select pno, pname, price, dcratio, prodesc, qty, imgfile, bigfile from product where pno=?");
		ProductVO pvo = null;
		try {
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setInt(1, pno);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				pvo =new ProductVO(
						pno,
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getInt("dcratio"),
						rs.getString("prodesc"),
						rs.getInt("qty"),
						rs.getString("imgfile"),
						rs.getString("bigfile")
					);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pvo;
	}
	
	//public ArrayList<ProductVO> findByName(String pname);	
	// like 연산자가 포함해서
	
	public ArrayList<ProductVO> findByName(String pname){
		sb.setLength(0);
		sb.append("select pno, pname, price, dcratio, prodesc, qty, imgfile, bigfile from product ");
		sb.append("where pname like ?");		
		ArrayList<ProductVO> list=new ArrayList<>();
		try {
			pstmt=conn.prepareStatement(sb.toString());
			pstmt.setString(1,"%"+pname+"%");
			rs=pstmt.executeQuery();			
			while(rs.next()) {
				ProductVO pvo =new ProductVO(
						rs.getInt("pno"),
						rs.getString("pname"),
						rs.getInt("price"),
						rs.getInt("dcratio"),
						rs.getString("prodesc"),
						rs.getInt("qty"),
						rs.getString("imgfile"),
						rs.getString("bigfile")
						);
				list.add(pvo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
}
