package com.hanbit.there.api.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanbit.there.api.dao.ContactDAO;
import com.hanbit.there.api.vo.ContactVO;

@Service
public class ContactService {

	@Autowired
	private ContactDAO contactDAO;

	public void contactUs(ContactVO contactVO) {
		contactDAO.insertContact(contactVO);
	}
}
