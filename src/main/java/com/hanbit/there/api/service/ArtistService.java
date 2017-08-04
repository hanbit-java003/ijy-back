package com.hanbit.there.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.there.api.dao.ArtistDAO;
import com.hanbit.there.api.vo.ArtistVO;
import com.hanbit.there.api.vo.MusicArtistVO;

@Service
public class ArtistService {

	@Autowired
	public ArtistDAO artistDAO;

	public List<ArtistVO> listArtist(ArtistVO artistVO) {
		return artistDAO.selectArtist(artistVO);
	}

	public List<MusicArtistVO> listMusicArtist(String id) {
		return artistDAO.selectMusicArtist(id);
	}
}
