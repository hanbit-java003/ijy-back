package com.hanbit.there.api.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.there.api.vo.ArtistVO;
import com.hanbit.there.api.vo.MusicArtistVO;

@Repository
public class ArtistDAO {

	@Autowired
	private SqlSession sqlSession;

	public List<ArtistVO> selectArtist(ArtistVO artistVO) {
		return sqlSession.selectList("exhibition.selectArtist", artistVO);
	}

	public List<MusicArtistVO> selectMusicArtist(String id) {
		return sqlSession.selectList("exhibition.selectMusic", id);
	}
}
