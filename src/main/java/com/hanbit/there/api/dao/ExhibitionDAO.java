package com.hanbit.there.api.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.there.api.vo.ArtistVO;
import com.hanbit.there.api.vo.ExhibitionVO;

@Repository
public class ExhibitionDAO {

	@Autowired
	public SqlSession sqlSession;

	public List<ExhibitionVO> selectMusicConcert() {
		return sqlSession.selectList("exhibition.selectMusicConcert");
	}

	public List<ExhibitionVO> selectPastExhibitions() {
		return sqlSession.selectList("exhibition.selectPastExhibitions");
	}

	public List<ArtistVO> selectArtist() {
		return sqlSession.selectList("exhibition.selectArtist");
	}

}
