package com.food.webapp.entity;

public class LunchFile {
	private String id;
	private String src;
	private String lunchId;
	
	public LunchFile(String id, String src, String lunchId) {
		super();
		this.id = id;
		this.src = src;
		this.lunchId = lunchId;
	}
	
	public LunchFile() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getLunchId() {
		return lunchId;
	}

	public void setNoticeId(String lunchId) {
		this.lunchId = lunchId;
	}
	
	
}
