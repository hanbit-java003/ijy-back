package com.hanbit.there.api.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.there.api.vo.PastVO;

@Repository
public class PastDAO {
	
	@Autowired
	public SqlSession sqlSession;
	
	public List<PastVO> selectPastExhibitions() {
		return sqlSession.selectList("past.selectPastExhibitions");
	}

}
