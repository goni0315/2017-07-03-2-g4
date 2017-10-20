package com.food.webapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.food.webapp.entity.Lunch;
import com.food.webapp.entity.NoticeView;

public interface LunchDao {
	
	List<NoticeView> getList(@Param("page") int page, String field, String query);
	int getCount();
	
	NoticeView get(String id);
	
	int update(String id, String title, String content);
	
	NoticeView getPrev(String id);
	
	NoticeView getNext(String id);
	
	String getNextId();
	
	int insert(Lunch lunch);
}
