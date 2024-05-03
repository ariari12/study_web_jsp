package kr.co.jhta.web.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import kr.co.jhta.web.vo.DeptVO;

public class DeptDAO {
	private SqlSessionFactory factory;
	public DeptDAO() {
		Reader r;
		try {
			r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			factory = builder.build(r);
			r.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	public List<DeptVO> selectAll(){
		SqlSession ss = factory.openSession(true);
		List<DeptVO> list=ss.selectList("kr.co.jhta.selectAll");
		return list;
	}
	
	public void insertOne(DeptVO vo) {
		SqlSession ss =factory.openSession(true);		
		ss.insert("kr.co.jhta.addOne",vo);
	}
	
	public void deleteOne(int deptno) {
		SqlSession ss =factory.openSession(true);	
		ss.delete("kr.co.jhta.deleteOne",deptno);
	}
	
	public void modifyOne(DeptVO vo) {
		SqlSession ss =factory.openSession(true);	
		ss.update("kr.co.jhta.modifyOne",vo);
	}

}
