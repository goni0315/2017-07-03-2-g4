package com.food.webapp.dao.mybatis;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.food.webapp.dao.LunchDao;
import com.food.webapp.entity.Lunch;
import com.food.webapp.entity.NoticeView;

public class MyBatisLunchDao implements LunchDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<NoticeView> getList(int page,String field, String query) {
		LunchDao notieDao = sqlSession.getMapper(LunchDao.class);		
		List<NoticeView> list = notieDao.getList(page, field, query);
		return list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NoticeView get(String id) {
		LunchDao noticeDao = sqlSession.getMapper(LunchDao.class);		
		NoticeView noticeView = noticeDao.get(id);
		return noticeView;
	}

	@Override
	public int update(String id, String title, String content) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NoticeView getPrev(String id) {
		LunchDao noticeDao = sqlSession.getMapper(LunchDao.class);		
		NoticeView result = noticeDao.getPrev(id);
		
		
		return result;
	}

	@Override
	public NoticeView getNext(String id) {
		LunchDao noticeDao = sqlSession.getMapper(LunchDao.class);		
		NoticeView result = noticeDao.getNext(id);
		
		
		
		return result;
	}

	@Override
	public String getNextId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Lunch lunch) {
		// TODO Auto-generated method stub
		return 0;
	}

}
