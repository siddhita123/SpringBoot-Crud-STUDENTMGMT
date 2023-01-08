package com.studentProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentProject.model.student;
import com.studentProject.service.myservice;

@RestController
@RequestMapping("/student")
public class studentController {
@Autowired
	myservice my;
	
@GetMapping("/")
public List<student> getall(){
	return my.getallstudent();
}


@GetMapping("/byid/{id}")

public student getstudentbyname(@PathVariable int id) {
	return my.getbyid(id);
}
	
@PostMapping("/add")
public List<student> add( @RequestBody student std){
	return my.savestudent(std);
}

@PutMapping("/update")
public List<student> updatestudent(@RequestBody student stude, @PathVariable int marks) {
	return my.updatestudent(stude, marks);
}

@RequestMapping(path = "/delete/{id}", method = RequestMethod.DELETE)
public List<student> deletestudent(@PathVariable int id) {
	return my.deletestudent(id);
}

}
