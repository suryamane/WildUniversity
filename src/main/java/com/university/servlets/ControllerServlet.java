package com.university.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.university.bean.Student;
import com.university.dao.StudentDao;
import com.university.dao.StudentDaoImp;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/controllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentDao sao = new StudentDaoImp();// creating an object for student data object

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equals("register")) {// click on register link
			response.sendRedirect("registration.jsp");// redirecting to registration page
		} else if (action.equals("list")) {// click on list of students
			List<Student> student = sao.getStudents();
			System.out.println(student);// getting students list
			ServletContext context = getServletContext();// creating context object
			context.setAttribute("studentData", student);// making student available throughout the application
			response.sendRedirect("list.jsp");// redirecting to list page
		} else if (action.equals("addStudent")) {
			String unumber = request.getParameter("uid");
			String gender = request.getParameter("gender");
			String name = request.getParameter("name");
			sao.addStudent(unumber, gender, name);
			response.sendRedirect("home.jsp");
		} else if (action.equals("cancelRegistration")) {
			response.sendRedirect("registration.jsp");
		} else if (action.equals("home")) {
			response.sendRedirect("home.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
