package com.hanbit.there.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.there.api.service.ExhibitionService;
import com.hanbit.there.api.vo.ExhibitionVO;

@RestController
@RequestMapping("/api/exhibitions/")
public class ExhibitionController {

	@Autowired
	public ExhibitionService exhibitionService;

	@RequestMapping("/concert")
	public List<ExhibitionVO> listMusicConcert() {
		return exhibitionService.listMusicConcert();
	}

	@RequestMapping("/past")
	public List<ExhibitionVO> listPastExhibitions() {
		return exhibitionService.listPastExhibitions();
	}

}
