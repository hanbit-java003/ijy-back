package com.hanbit.there.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.there.api.service.ArtistService;
import com.hanbit.there.api.vo.ArtistVO;
import com.hanbit.there.api.vo.MusicArtistVO;

@RestController
@RequestMapping("/api/")
public class ArtistController {

	@Autowired
	public ArtistService artistService;

	@RequestMapping("/artist")
	public List<ArtistVO> listArtist(ArtistVO artistVO) {
		return artistService.listArtist(artistVO);
	}

	@RequestMapping("/{id}")
	public List<MusicArtistVO> listMusicArtist(@PathVariable("id") String id) {
		return artistService.listMusicArtist(id);
	}

}
