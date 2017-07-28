package com.hanbit.there.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.there.api.dao.ExhibitionDAO;
import com.hanbit.there.api.vo.ArtistVO;
import com.hanbit.there.api.vo.ExhibitionVO;

@Service
public class ExhibitionService {

	@Autowired
	public ExhibitionDAO exhibitionDAO;

	public List<ExhibitionVO> listMusicConcert() {
		return exhibitionDAO.selectMusicConcert();
	}

	public List<ExhibitionVO> listPastExhibitions() {
		return exhibitionDAO.selectPastExhibitions();
	}

	public List<ArtistVO> listArtist() {
		return exhibitionDAO.selectArtist();
	}
}
