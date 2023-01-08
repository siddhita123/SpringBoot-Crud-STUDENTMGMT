package com.studentProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.studentProject.model.student;
@Service
public class studentService implements myservice{

	List<student> students = new ArrayList<student>();
	public studentService()
	{
		students.add(new student(1,"siddhita","kamblekar",70));
		students.add(new student(2,"akanksha","balode",70));
		students.add(new student(3,"sarvesh","sutar",70));

		
	}
	@Override
	public List<student> getallstudent() {
		return students;
	}

	@Override
	public student getbyid(int id) {
		student stu =null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId()==(id)) {
				stu = new student(students.get(i).getId(), students.get(i).getName(),students.get(i).getLastname(),
						students.get(i).getMarks());
				break;
			}
		}
		return stu;
	}
	@Override
	public List<student> savestudent(student stud) {
		try {
			students.add(stud);
			return students;
		} catch (Exception e) {
			System.out.println("error occured");
			return students;		}
	
	}
	

	@Override
	public List<student> updatestudent(student stude,int marks) {
		for(int i=0;i < students.size();i++) {
			if(stude.getId()==students.get(i).getId()) {
				students.get(i).setMarks(marks);
				return students;
			}
					}
		return students;
	}
	
	@Override
	public List<student> deletestudent(int id) {
		for (int i = 0; i < students.size(); i++) {
			student emp = students.get(i);
			if (emp.getId() == id) {
				students.remove(emp);
				return students;
			}
		}
		return students;
	
	}
	
	


	
	
}
