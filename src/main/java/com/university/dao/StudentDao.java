package com.university.dao;

import java.util.List;

import com.university.bean.Student;

public interface StudentDao {
	 List<Student> getStudents();
	void addStudent(String unumber,String gender,String name);
}
