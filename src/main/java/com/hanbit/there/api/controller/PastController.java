package com.hanbit.there.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanbit.there.api.service.PastService;
import com.hanbit.there.api.vo.PastVO;

@RestController
@RequestMapping("/api/exhibition")
public class PastController {
	
	@Autowired
	public PastService pastService;
	
	@RequestMapping("/past")
	public List<PastVO> listPastExhibitions() {
		return pastService.listPastExhibitions();
	}

}
