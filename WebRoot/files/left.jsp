<%@page import="cn.sxt.stusc.entity.Admin"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	 <base href="<%=basePath%>">
	 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<style type="text/css">
			<!-- body {
				margin-left: 0px;
				margin-top: 0px;
				margin-right: 0px;
				margin-bottom: 0px;
				background-image: url(<%=basePath%>/images/left.gif);
			}
			-->
		</style>
		<link href="<%=basePath%>/css/css.css" rel="stylesheet" type="text/css" />
	</head>
	<SCRIPT language=JavaScript>
		function tupian(idt) {
			var nametu = "xiaotu" + idt;
			var tp = document.getElementById(nametu);
			tp.src = "<%=basePath%>/images/ico05.gif"; //图片ico04为白色的正方形
			for (var i = 1; i < 30; i++) {
				var nametu2 = "xiaotu" + i;
				if (i != idt * 1) {
					var tp2 = document.getElementById('xiaotu' + i);
					if (tp2 != undefined) {
						tp2.src = "<%=basePath%>/images/ico06.gif";
					} //图片ico06为蓝色的正方形
				}
			}
		}

		function list(idstr) {
			var name1 = "subtree" + idstr;
			var name2 = "img" + idstr;
			var objectobj = document.all(name1);
			var imgobj = document.all(name2);
			//alert(imgobj);
			if (objectobj.style.display == "none") {
				for (i = 1; i < 10; i++) {
					var name3 = "img" + i;
					var name = "subtree" + i;
					var o = document.all(name);
					if (o != undefined) {
						o.style.display = "none";
						var image = document.all(name3);
						//alert(image);
						image.src = "<%=basePath%>/images/ico04.gif";
					}
				}
				objectobj.style.display = "";
				imgobj.src = "<%=basePath%>/images/ico03.gif";
			} else {
				objectobj.style.display = "none";
				imgobj.src = "<%=basePath%>/images/ico04.gif";
			}
		}
	</SCRIPT>

	<body>
		<!-- 个人信息 -->
		<table width="198" border="0" cellpadding="0"  cellspacing="0" class="left-table01">
			<tr>
				<TD>
					<table width="100%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="207" height="55" background="<%=basePath%>/images/nav01.gif">
								<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="25%" rowspan="2"><img src="<%=basePath%>/images/ico02.gif" width="35" height="35" /></td>
										<td width="75%" height="22" class="left-font01">您好，<% 
										Admin admin = (Admin)request.getSession().getAttribute("admin");
										System.out.print(admin.getUsername());
// 										 admin.getUsername();
										 %><%=admin.getUsername()%><span class="left-font02"></span></td>
									</tr>
									<tr>
										<td height="22" class="left-font01">
											[&nbsp;<a href="<%=basePath%>/LogoutServlet.jsp" target="_top" class="left-font01">退出</a>&nbsp;]</td>
									</tr>
								</table>
							</td>
						</tr>
					</table>

					<!-- 1.管理员显示的功能开始    -->
					<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
						<tr>
							<td height="29">
								<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="8%"><img name="img8" id="img8" src="<%=basePath%>/images/ico04.gif" width="8" height="11" /></td>
										<td width="92%">
											<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('8');">管理员功能</a></td>
									</tr>
								</table>
							</td>
						</tr>
					</TABLE>
					<table id="subtree8" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
						<tr>
							<td width="9%" height="20"><img id="xiaotu20" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="<%=basePath%>adminInformation.jsp" target="mainFrame" class="left-font03" onClick="tupian('20');">查看个人信息</a></td>
						</tr>
						<tr>
							<td width="9%" height="21"><img id="xiaotu21" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="adminRegister.jsp" target="mainFrame" class="left-font03" onClick="tupian('21');">添加新的管理员</a></td>
						</tr>
					</table>

					<!--  1.1 学生功能开始    -->
					<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
						<tr>
							<td height="29">
								<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="8%"><img name="img7" id="img7" src="<%=basePath%>/images/ico04.gif" width="8" height="11" /></td>
										<td width="92%">
											<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('7');">学生功能</a></td>
									</tr>
								</table>
							</td>
						</tr>
					</TABLE>
					<table id="subtree7" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
						<tr>
							<td width="9%" height="20"><img id="xiaotu17" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%">
								<a href="studentRegister.html" target="mainFrame" class="left-font03" onClick="tupian('17');">添加学生</a></td>
						</tr>
						<tr>
							<td width="9%" height="20"><img id="xiaotu18" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%">
								<a href="studentList.html" target="mainFrame" class="left-font03" onClick="tupian('18');">获取所有学生</a></td>
						</tr>
					</table>
					<!--  1.1 学生功能结束    -->

					<!--  1.2 课程功能开始    -->
					<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
						<tr>
							<td height="29">
								<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="8%"><img name="img1" id="img1" src="<%=basePath%>/images/ico04.gif" width="8" height="11" /></td>
										<td width="92%">
											<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('1');">课程功能</a></td>
									</tr>
								</table>
							</td>
						</tr>
					</TABLE>
					<table id="subtree1" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
						<tr>
							<td width="9%" height="20"><img id="xiaotu1" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="courseRegister.html" target="mainFrame" class="left-font03" onClick="tupian('1');">添加课程</a></td>
						</tr>
						<tr>
							<td width="9%" height="20"><img id="xiaotu2" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="courseList.html" target="mainFrame" class="left-font03" onClick="tupian('2');">查询课程</a></td>
						</tr>
					</table>
					<!--  1.2 课程功能结束    -->

					<!--  1.3 教师功能开始    -->
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
						<tr>
							<td height="29">
								<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="8%" height="12"><img name="img2" id="img2" src="<%=basePath%>/images/ico04.gif" width="8" height="11" /></td>
										<td width="92%"><a href="javascript:" target="mainFrame" class="left-font03" onClick="list('2');">教师功能</a></td>
									</tr>
								</table>
							</td>
						</tr>
					</table>

					<table id="subtree2" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">

						<tr>
							<td width="9%" height="20"><img id="xiaotu7" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="teacherRegister.html" target="mainFrame" class="left-font03" onClick="tupian('7');">添加教师</a></td>
						</tr>
						<tr>
							<td width="9%" height="20"><img id="xiaotu8" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="teacherList.html" target="mainFrame" class="left-font03" onClick="tupian('8');">查询教师</a></td>
						</tr>
					</table>

					<!--  1.3 教师功能结束    -->
					<!--  1.管理员显示的功能结束    -->

					<!--  2.学生显示的功能开始    -->
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
						<tr>
							<td height="29">
								<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="8%" height="12"><img name="img3" id="img3" src="<%=basePath%>/images/ico04.gif" width="8" height="11" /></td>
										<td width="92%"><a href="javascript:" target="mainFrame" class="left-font03" onClick="list('3');">学生功能</a></td>
									</tr>
								</table>
							</td>
						</tr>
					</table>

					<table id="subtree3" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
						<tr>
							<td width="9%" height="20"><img id="xiaotu9" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="studentInformation.html" target="mainFrame" class="left-font03" onClick="tupian('9');">查看个人信息</a></td>
						</tr>
						<tr>
							<td width="9%" height="20"><img id="xiaotu10" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="courseSelectList.html" target="mainFrame" class="left-font03" onClick="tupian('10');">选课</a></td>
						</tr>
						<tr>
							<td width="9%" height="20"><img id="xiaotu11" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="courseSelectedList.html" target="mainFrame" class="left-font03" onClick="tupian('11');">查看已选课程</a></td>
						</tr>
					</table>

					<!--  学生显示的功能结束    -->

					<!--  教师显示的功能开始    -->
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
						<tr>
							<td height="29">
								<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
									<tr>
										<td width="8%" height="12"><img name="img4" id="img4" src="<%=basePath%>/images/ico04.gif" width="8" height="11" /></td>
										<td width="92%"><a href="javascript:" target="mainFrame" class="left-font03" onClick="list('4');">教师功能</a></td>
									</tr>
								</table>
							</td>
						</tr>
					</table>

					<table id="subtree4" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
						<tr>
							<td width="9%" height="20"><img id="xiaotu12" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="teacherInformation.html" target="mainFrame" class="left-font03" onClick="tupian('12');">查看个人信息</a></td>
						</tr>
						<tr>
							<td width="9%" height="20"><img id="xiaotu13" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="mark.html" target="mainFrame" class="left-font03" onClick="tupian('13');">评分</a></td>
						</tr>
						<tr>
							<td width="9%" height="20"><img id="xiaotu14" src="<%=basePath%>/images/ico06.gif" width="8" height="12" /></td>
							<td width="91%"><a href="scheduleList.html" target="mainFrame" class="left-font03" onClick="tupian('14');">查看任课课程</a></td>
						</tr>
					</table>

					<!--  教师显示的功能结束    -->

				</TD>
			</tr>

		</table>
	</body>

</html>