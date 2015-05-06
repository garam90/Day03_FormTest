package com.sds.icto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/param")
public class ParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String birth = request.getParameter("birth");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String company = request.getParameter("company");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("name >> "+name);
		out.println("<br>email >> "+email);
		out.println("<br>birth >> "+birth);
		out.println("<br>age >> "+age+"세");
		out.println("<br>gender >> "+gender);
		out.println("<br>hobby >> ");
		for (int i = 0; i < hobby.length; i++) {
			out.print(hobby[i]+"    ");
		}
		out.println("<br>company >> "+company);
		
	}

}
