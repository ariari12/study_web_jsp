package dao;

import java.util.ArrayList;
import java.util.Iterator;

import vo.ProductVO;

public class TestMain {

	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		
		ArrayList<ProductVO> list = dao.selectAll();
		
		for(ProductVO vo : list) {
			System.out.println(vo.toString());
		}
		System.out.println("총 상품 개수 : "+list.size());
		System.out.println("----------------------------------------------");
		
		
		ProductVO vo = dao.getOne(18);
		System.out.println(vo.getPname());
		
		System.out.println("----------------------------------------------");
		ArrayList<ProductVO> list2 = dao.findByName("콩순");
		
		for(ProductVO vo2 : list2) {
			System.out.println("상품명 : "+vo2.getPname());
		}
	}
}