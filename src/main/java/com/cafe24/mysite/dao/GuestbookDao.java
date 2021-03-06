package com.cafe24.mysite.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.mysite.vo.GuestbookVo;


@Repository
public class GuestbookDao {
	

	@Autowired
	private SqlSession sqlSession;
	
	public Boolean delete(GuestbookVo vo) {
		int count = sqlSession.delete("guest.delete", vo);		
		return 1 == count;
	}
	
	public Boolean insert(GuestbookVo vo) {
		int count = sqlSession.insert("guest.insert", vo);
		return 1 == count;
	}	
	
	public List<GuestbookVo> getList(){
		List<GuestbookVo> result = sqlSession.selectList("guest.getList");
		return result;
	}	
	
}
