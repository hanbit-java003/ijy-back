package com.hanbit.there.api.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hanbit.there.api.vo.ContactVO;

@Repository
public class ContactDAO {

	@Autowired
	public SqlSession sqlSession;

	public int insertContact(ContactVO contactVO) {
		return sqlSession.insert("exhibition.insertContact", contactVO);
	}

}
