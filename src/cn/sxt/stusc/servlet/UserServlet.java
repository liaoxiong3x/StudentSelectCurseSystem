package cn.sxt.stusc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.sxt.stusc.dao.AdminDao;
import cn.sxt.stusc.dao.impl.AdminDaoImpl;
import cn.sxt.stusc.entity.Admin;

public class UserServlet extends BaseServlet {


//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		this.doPost(request, response);
//	}
//
//	
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		String method= request.getParameter("method");
//		if("login".equals(method)){
//			this.login(request, response);
//		}else if("register".equals(method)){
//			this.register(request, response);
//		}
//		
//	}
	public void login(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
//		System.out.println("帐号:"+username);
//		byte[] bytes;
//		try {
//			//将乱码的字符串转换成在网络上传输的原始字节数组
//			bytes = username.getBytes("iso-8859-1");
//			//将原始的字节数组按照UTF-8转换成字符串
//			username = new String(bytes,"utf-8");
//		}catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//		}
			
		String pwd = req.getParameter("pwd");
		String remember = req.getParameter("remember"); 
		AdminDao adminDao = new AdminDaoImpl();
		Admin admin = adminDao.findAdmin(username, pwd);
		boolean flag = false;
		if (admin.getUsername()!=null) {
			req.getSession().setAttribute("admin", admin);
			flag=true;
		}
		if(flag){
			String cusername = URLEncoder.encode(username, "utf-8");
			Cookie cookieName = new Cookie("username", cusername);
			Cookie cookiePwd = new Cookie("pwd", pwd);
			Cookie cookieRemember = new Cookie("remember", remember);
			//范围
			if ("yes".equals(remember)) {
//				cookieName.setMaxAge(60*60*24*10);
//				cookiePwd.setMaxAge(60*60*24*10);
//				cookieRemember.setMaxAge(60*60*24*10);
			}
			cookieName.setPath("/StuSelectCProduct/");
			cookiePwd.setPath("/StuSelectCProduct/");
			cookieRemember.setPath("/StuSelectCProduct/");
			//添加到cookie
			resp.addCookie(cookieName);
			resp.addCookie(cookiePwd);
			resp.addCookie(cookieRemember);
			//跳转
//			resp.sendRedirect("/StuSelectCProduct/index.jsp");
			//转发
//			req.getRequestDispatcher(req.getContextPath()+"/index.jsp").forward(req, resp);
			//统计数量
			ServletContext context = req.getServletContext();
			Integer count = (Integer)context.getAttribute("count");
			if (count==null) {
				count=1;
			}else {
				count++;
			}
			
			context.setAttribute("count", count);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}else{
			resp.sendRedirect("/StuSelectCProduct/Login.jsp");
		}
	}
	public void register(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获得个属性的值
			String userID = (String )request.getParameter("userID");
			String username = (String )request.getParameter("username");
			String password = (String )request.getParameter("password");
			String score = request.getParameter("score");
			String hobby = Arrays.toString(request.getParameterValues("hobby"));
			String age = request.getParameter("age");
			//将字符串转换成时间
			String enterDate = (String)request.getParameter("enterDate");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date=null;
			try {
				date = format.parse(enterDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			//创建用户对象
			Admin admin = new Admin(userID, username, password, Integer.parseInt(age), Integer.parseInt(score), date, hobby);
			//存入数据库
			AdminDao adminDao = new AdminDaoImpl();
			int flag = adminDao.saveAdmin(admin);
			if (flag>0) {
				//成功跳转
				request.getRequestDispatcher("/success.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("/adminRegister.jsp").forward(request, response);
			}
			
	}
}