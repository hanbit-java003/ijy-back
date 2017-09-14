package com.hanbit.there.api.vo;

public class NewsVO {

	private String id;
	private int no;
	private String title;
	private String dateDt;
	private int views;

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDateDt() {
		return dateDt;
	}
	public void setDateDt(String dateDt) {
		this.dateDt = dateDt;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
