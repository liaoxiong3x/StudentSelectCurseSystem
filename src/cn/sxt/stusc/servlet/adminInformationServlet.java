package cn.sxt.stusc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sxt.stusc.entity.Admin;

public class adminInformationServlet extends HttpServlet {

	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		显示数据信息
		Admin admin = (Admin)request.getSession().getAttribute("admin");
		System.out.println("inf"+admin);
		request.getSession().setAttribute("admin", admin);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);
	}
	
}
