package test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Hello MyBatis World");
		
		// 1. MyBatis 의 설정파일을 읽기 (설계도)
		try {
			Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		// 2. 건설 노동장 : SqlSessionFactoryBuilder
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		// 3. 공장 건설	
			SqlSessionFactory factory = builder.build(r);
		// 4. 설계도 닫기
			r.close();
		// 5. 자동차 생산
			SqlSession ss=factory.openSession(true); // true : auto commit, false 수동커밋
			
			System.out.println("ss : "+ss);
			
		// Connection conn <== SqlSession <== SqlSessionFactory <== SqlSessionFactoryBuilder	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
