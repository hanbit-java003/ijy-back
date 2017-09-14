package com.hanbit.there.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.there.api.service.NewsService;
import com.hanbit.there.api.vo.NewsVO;

@RestController
@RequestMapping("/api")
public class NewsController {

	@Autowired
	public NewsService newsService;

	@RequestMapping("/press")
	public List<NewsVO> list(NewsVO newsVO) {
		return newsService.getList(newsVO);
	}

}
