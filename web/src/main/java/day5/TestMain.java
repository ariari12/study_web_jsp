package day5;

import java.util.ArrayList;

import dao.ProductDAO;
import vo.ProductVO;

public class TestMain {
	public static void main(String[] args) {
		ProductDAO dao=new ProductDAO();
		ArrayList<ProductVO> list=dao.selectAll();
		for(ProductVO pvo :list) {
			System.out.println(pvo.toString());
		}
		
		ProductVO pvo =dao.getOne(1);
		System.out.println(pvo.toString());
	}
	
	

}
