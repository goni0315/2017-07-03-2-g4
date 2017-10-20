package com.food.webapp.dao.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.food.webapp.dao.LunchDao;
import com.food.webapp.entity.Lunch;
import com.food.webapp.entity.NoticeView;

public class SpringLunchDao implements LunchDao {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NoticeView get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(String id, String title, String content) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public NoticeView getPrev(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoticeView getNext(String id) {
		// TODO Auto-generated method stub
		return null;
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
