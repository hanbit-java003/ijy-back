package com.hanbit.there.api.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.there.api.vo.NewsVO;

@Repository
public class NewsDAO {

	@Autowired
	public SqlSession sqlSession;

	public List<NewsVO> selectList(NewsVO newsVO) {
		return sqlSession.selectList("exhibition.selectNews", newsVO);
	}

	public List<NewsVO> selectArticle() {
		return null;
	}

}
