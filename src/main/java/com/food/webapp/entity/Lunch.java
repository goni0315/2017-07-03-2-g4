package com.food.webapp.entity;

public class Lunch {
	
	private int id;
	private String name;
	private int Distance;
	private String mapPoint;
	
	public Lunch(int id, String name, int distance, String mapPoint) {
		super();
		this.id = id;
		this.name = name;
		Distance = distance;
		this.mapPoint = mapPoint;
	}
	
	public Lunch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
	}
	public String getMapPoint() {
		return mapPoint;
	}
	public void setMapPoint(String mapPoint) {
		this.mapPoint = mapPoint;
	}
}
