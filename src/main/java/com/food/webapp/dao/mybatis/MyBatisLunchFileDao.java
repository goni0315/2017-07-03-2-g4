package com.food.webapp.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.food.webapp.dao.LunchFileDao;
import com.food.webapp.entity.LunchFile;

public class MyBatisLunchFileDao implements LunchFileDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<LunchFile> getListByNoticeId(String NoticeId) {
		LunchFileDao noticeFileDao = sqlSession.getMapper(LunchFileDao.class);		
		List<LunchFile> list = noticeFileDao.getListByNoticeId(NoticeId);
		
		return list;
	}

	@Override
	public int insert(LunchFile noticeFile) {
		LunchFileDao noticeFileDao = sqlSession.getMapper(LunchFileDao.class);		
		int result = noticeFileDao.insert(noticeFile);
		
		return result;
	}

	@Override
	public int update(LunchFile noticeFile) {
		LunchFileDao noticeFileDao = sqlSession.getMapper(LunchFileDao.class);		
		int result = noticeFileDao.update(noticeFile);
		
		return result;
	}

	@Override
	public int delete(String id) {
		LunchFileDao noticeFileDao = sqlSession.getMapper(LunchFileDao.class);		
		int result = noticeFileDao.delete(id);
		
		return result;
	}
	


}
