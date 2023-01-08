package com.studentProject.model;

public class student {
	private int id;
	private String name;
	private String lastname;
	private int marks;
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, String lastname, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.marks = marks;
	}
	

}
