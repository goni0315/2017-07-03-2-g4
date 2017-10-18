package com.food.webapp.dao;

import java.util.List;

import com.food.webapp.entity.LunchFile;

public interface LunchFileDao {
	
	List<LunchFile> getListByNoticeId(String NoticeId);
	
	int insert(LunchFile lunchFile);
	int update(LunchFile noticeFile);
	int delete(String id);
}
