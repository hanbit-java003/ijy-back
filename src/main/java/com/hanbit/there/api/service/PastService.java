package com.hanbit.there.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.there.api.dao.PastDAO;
import com.hanbit.there.api.vo.PastVO;

@Service
public class PastService {
	
	@Autowired
	public PastDAO pastDAO;
	
	public List<PastVO> listPastExhibitions() {
		return pastDAO.selectPastExhibitions();
	}

}
