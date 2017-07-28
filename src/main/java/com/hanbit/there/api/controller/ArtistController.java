package com.hanbit.there.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.there.api.service.ExhibitionService;
import com.hanbit.there.api.vo.ArtistVO;

@RestController
@RequestMapping("api/")
public class ArtistController {

	@Autowired
	public ExhibitionService exhibitionService;

	@RequestMapping("")
	public List<ArtistVO> listArtist() {
		return exhibitionService.listArtist();
	}

}
