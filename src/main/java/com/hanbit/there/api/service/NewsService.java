package com.hanbit.there.api.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.there.api.dao.NewsDAO;
import com.hanbit.there.api.vo.NewsVO;

@Service
public class NewsService {

	@Autowired
	public NewsDAO newsDAO;

	public List<NewsVO> getList(NewsVO newsVO) {
		return newsDAO.selectList(newsVO);
	}

	public List<NewsVO> getArticle() {
		return null;
	}


}
