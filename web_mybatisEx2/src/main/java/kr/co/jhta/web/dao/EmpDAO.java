package kr.co.jhta.web.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.co.jhta.web.vo.EmpVO;

public class EmpDAO {
	private SqlSessionFactory factory;
	
	public EmpDAO() {
		try {
			Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			factory = builder.build(r);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<EmpVO> selectAll(){
		SqlSession ss = factory.openSession(true);
		List<EmpVO> list =ss.selectList("kr.co.jhta.web.selectAll");	
		return list;
		
	}
	
	public EmpVO selectOne(int empno){
		SqlSession ss = factory.openSession(true);
		EmpVO vo =ss.selectOne("kr.co.jhta.web.selectOne",empno);
		System.out.println(vo);
		return vo;		
	}
	
	public void updateOne(EmpVO vo) {
		SqlSession ss = factory.openSession(true);
		ss.update("kr.co.jhta.web.updateOne",vo);
	}
	
	public void deleteOne(int empno) {
		SqlSession ss = factory.openSession(true);
		ss.delete("kr.co.jhta.web.deleteOne",empno);
	}

}
