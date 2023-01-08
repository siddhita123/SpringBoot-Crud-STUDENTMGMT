package com.studentProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentProject.model.student;


public interface myservice {

	public List<student> getallstudent();
	public List<student> savestudent(student stud); 

	public List<student> updatestudent(student stude,int marks);
	public List<student> deletestudent(int id);
	public student getbyid(int id);
}
