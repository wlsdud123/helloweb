package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Gugudan")
public class Gugudan extends HttpServlet {
	//필드
       
	//생성자
	// 디폴트생성자 사용
	
	//메소드 -gs(X)
	
	//메소드 -일반
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//코드
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		out.println("<table border='1'>");
		
		for(int i=1; i<=9; i++) {
			out.println("    <tr>");
			out.println("        <td>"+ dan +"</td>");
			out.println("        <td>"+ i +"</td>");
			out.println("        <td>"+ dan*i +"</td>");
			out.println("    </tr>");
		}

		out.println("</table>");
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
