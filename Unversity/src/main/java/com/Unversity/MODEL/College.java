package com.Unversity.MODEL;


public class College {

	private String branchs;
	private String id;
	private String collegeName;
	public String getBranchs() {
		return branchs;
	}
	public void setBranchs(String branchs) {
		this.branchs = branchs;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public College(String branchs, String id, String collegeName) {
		super();
		this.branchs = branchs;
		this.id = id;
		this.collegeName = collegeName;
	}
	public College() {
		
	}
	
}
