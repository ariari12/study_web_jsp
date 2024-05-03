package test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import vo.EmpVO;

public class TestMain {

	public static void main(String[] args) {
		// 1. 설정 파일 읽어오기
		try {
			Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
			// 2. 빌더
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			// 3. 팩토리
			SqlSessionFactory factory = builder.build(r);
			// 4. 자원반납
			r.close();
			// 5. 세션 객체 (ss)
			SqlSession ss = factory.openSession(true);
			// 6. 사원 테이블에서 전체 데이터 가져오기
			List<EmpVO> list=ss.selectList("selectAll");
			// 7. 향상된 for문을 사용해서 출력
			for(EmpVO vo : list) {
				System.out.println(vo);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 

	}

}
