package com.university.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.university.bean.Student;

public class StudentDaoImp implements StudentDao {
	
	DBConnectionUtil conn = new DbConnections();

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();

	
	//	Connection c1 = conn.getConnection();
		try {

			Statement stmt = conn.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");

			while (rs.next()) {
				Student student = new Student(rs.getString("unumber"), rs.getString("sex"), rs.getString("name"));
				students.add(student);

			}
			System.out.println(students);
		} catch (SQLException e) {
			// TODO Auto-generated catch block

		} finally {
			//conn.closeConnection();
		
				//conn.closeConnection();
			
		}

		return students;
	}

	public void addStudent(String unumber, String gender, String name) {

		PreparedStatement preparedStatement = null;
		
		//Connection c = conn.getConnection();
		String insertTableSQL = "INSERT INTO STUDENT" + "(UNUMBER, SEX, NAME) VALUES" + "(?,?,?)";
		try {
			/*
			 * PreparedStatement stmt=con.prepareStatement("insert into Emp values(?,?)");
			 * int i=stmt.executeUpdate();
			 * 
			 */
			preparedStatement = conn.getConnection().prepareStatement(insertTableSQL);
			preparedStatement.setString(1, unumber);
			preparedStatement.setString(2, gender);
			preparedStatement.setString(3, name);
			// execute insert SQL statement
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//conn.closeConnection();
		}
	}

}
