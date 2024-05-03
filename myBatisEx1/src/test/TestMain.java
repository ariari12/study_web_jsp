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
			
			// Connection conn <== SqlSession <== SqlSessionFactory <== SqlSessionFactoryBuilder			
			// JDBC	: Connection
			// MyBatis : SqlSession
			
			
			System.out.println("===========================================================");
			// 1건 추가
			DeptVO vo2 = new DeptVO(99,"회계","LA");
			ss.insert("addOne",vo2);
			
			System.out.println("===========================================================");
			
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
			
			// 1건 데이터 읽기
			DeptVO vo=ss.selectOne("SelectOne",20);
			System.out.println("vo : "+vo);
			
			System.out.println("===========================================================");
			
			// 2번 부서 확인.. 1건 수정 부서명 IT, 지역 울산
			DeptVO vo3 = new DeptVO();
			
			vo3.setDeptno(1);
			vo3.setDname("IT");
			vo3.setLoc("울산");
			System.out.println(vo3);
			ss.update("modifyOne",vo3);
			
			DeptVO vo4 = ss.selectOne("SelectOne",1);
			System.out.println("수정 후 : "+vo4);
			
			System.out.println("===========================================================");
			
			//3번 부서를 삭제
			ss.delete("deleteDeptOne",3);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
