package test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.DeptVO;

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
			
			// JDBC	: Connection
			// MyBatis : SqlSession
			
			// ss.selectList("별칭명");
			
			List<DeptVO> list =ss.selectList("AllDept");
			
			System.out.println("list : "+ list);
			
			// for문 사용해서 부서번호 : 부서명 : 위치 형식으로 출력
			for(DeptVO vo : list) {
				System.out.println("부서번호 : "+vo.getDeptno()+" 부서명 : "+vo.getDname()
				+" 위치 : "+vo.getLoc());				 
			}
			System.out.println("===========================================================");
			
			// Stream 을 사용해서 부서번호 : 부서명 : 위치 형식으로 출력
			list.stream().forEach(s->System.out.println("부서번호 : "+s.getDeptno()+" 부서명 : "+s.getDname()
			+" 위치 : "+s.getLoc()));
			
		// Connection conn <== SqlSession <== SqlSessionFactory <== SqlSessionFactoryBuilder	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
