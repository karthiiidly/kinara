package com.studentmanagmentsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studentmanagmentsystem.exception.Invalidcrudential;
import com.studentmanagmentsystem.module.Students;
import com.studentmanagmentsystem.repositry.StudentRepo;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentManagmentController {

	@Autowired
	StudentRepo repo;
	
	@RequestMapping("StudentManagmentsystem")
	String managment(){
		return "StudentManagment.jsp";
	}
	
	@RequestMapping("Insert")
	String InsertData() {
		return "Insert.jsp";
	}
	@RequestMapping("inserted")
	String Inserted(HttpSession h,Students s) {
		repo.save(s);
		h.setAttribute("inserted",s.getName()+" details are inserted");
		return "Insert.jsp";
	}
	@RequestMapping("updated")
	String update(HttpSession h,Students s ) {
		Students s1=repo.findById(s.getSid()).orElse(null);
		if(s1!=null) {
			s1.setSid(s.getSid());
			s1.setName(s.getName());
			s1.setAddress(s.getAddress());
			s1.setAge(s.getAge());
			s1.setGender(s.getGender());
			s1.setMarks(s.getMarks());
			s1.setPhno(s.getPhno());
			s1.setStd(s.getStd());
			repo.save(s1);
			h.setAttribute("updated",s.getSid()+" details are updated");
			return "update.jsp";
		}
		else {
			throw new Invalidcrudential("student",s.getSid()+"");
		}
	}
	
	@RequestMapping("details")
	String fetch(HttpSession h,String name ) {
		Students s=repo.fetchbyname(name);
		h.setAttribute("name","student name:"+ s.getName());
		h.setAttribute("std", "student class:"+s.getStd());
		h.setAttribute("gender","student gender:"+ s.getGender());
		h.setAttribute("age", "student age:"+s.getAge());
		h.setAttribute("phno", "student phno:"+s.getAddress());
		h.setAttribute("marks", "student marks:"+s.getMarks());
		h.setAttribute("address", "studnet address:"+s.getAddress());
		return "fetch.jsp";
	}
	@RequestMapping("deleted")
	String delete(HttpSession h,int sid) {
		Students s=repo.findById(sid).orElse(null);
		if(s!=null) {
			h.setAttribute("deleted", s.getName()+" details are deleted succesffully");
			repo.delete(s);
			return "Delete.jsp";
		}
		else {
			throw new Invalidcrudential("student",sid+"");
		}
	}
}
