<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
    <base href="<%=basePath%>"/>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<meta http-equiv="expires" content="0"/>    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3"/>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title></title>
		<style type="text/css">
			<!-- body {
				margin-left: 0px;
				margin-top: 0px;
				margin-right: 0px;
				margin-bottom: 0px;
			}
			.tabfont01 {
				font-family: "宋体";
				font-size: 9px;
				color: #555555;
				text-decoration: none;
				text-align: center;
			}
			.font051 {
				font-family: "宋体";
				font-size: 12px;
				color: #333333;
				text-decoration: none;
				line-height: 20px;
			}
			.font201 {
				font-family: "宋体";
				font-size: 12px;
				color: #FF0000;
				text-decoration: none;
			}
			.button {
				font-family: "宋体";
				font-size: 14px;
				height: 37px;
			}
			html {
				overflow-x: auto;
				overflow-y: auto;
				border: 0;
			}
			-->
		</style>

		<link href="<%=basePath%>/css/css.css" rel="stylesheet" type="text/css" />
		<script type="text/JavaScript">

		</script>
		<link href="<%=basePath%>/css/style.css" rel="stylesheet" type="text/css" />
	</head>
	<SCRIPT language=JavaScript>
		function sousuo() {
			window.open("gaojisousuo.htm", "", "depended=0,alwaysRaised=1,width=800,height=510,location=0,menubar=0,resizable=0,scrollbars=0,status=0,toolbar=0");
		}

		function selectAll() {
			var obj = document.fom.elements;
			for (var i = 0; i < obj.length; i++) {
				if (obj[i].name == "delid") {
					obj[i].checked = true;
				}
			}
		}

		function unselectAll() {
			var obj = document.fom.elements;
			for (var i = 0; i < obj.length; i++) {
				if (obj[i].name == "delid") {
					if (obj[i].checked == true) obj[i].checked = false;
					else obj[i].checked = true;
				}
			}
		}

		function link() {
			document.getElementById("fom").action = "yuangong.htm";
			document.getElementById("fom").submit();
		}
	</SCRIPT>

	<body>
		<form name="fom" id="fom" method="post">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">

				<tr>
					<td height="30">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td height="62" background="<%=basePath%>/images/nav04.gif">
									<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
										<tr>
											<td width="20"></td>
											<td>
												给课程
												<select name="select2">
													<option>--请选择课程--</option>
													<option>javase</option>
													<option>javaee</option>
													<option>oracle</option>
												</select>
												指定教师
												<select name="select2">
													<option>--请选择教师--</option>
													<option>赵老师</option>
													<option>钱老师</option>
													<option>孙老师33</option>
												</select>
												
												<input name="Submit" type="button" class="right-button02" value="提 交" />
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td>
						<table id="subtree1" style="DISPLAY: " width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
									<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
										<tr>
											<td height="40" class="font42">
												<table width="100%" border="0" cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

													<tr>
														<td height="20" colspan="15" align="center" bgcolor="#EEEEEE" class="tablestyle_title" style="text-align: center;"> 课程列表 </td>
													</tr>
													<tr>
														<td width="6%" align="center" bgcolor="#EEEEEE">选择</td>
														<td width="9%" height="20" align="center" bgcolor="#EEEEEE">课程编号</td>
														<td width="9%" align="center" bgcolor="#EEEEEE">课程名</td>
														<td width="9%" align="center" bgcolor="#EEEEEE">学分</td>
														<td width="8%" align="center" bgcolor="#EEEEEE">开课时间</td>
														<td width="8%" align="center" bgcolor="#EEEEEE">结课时间</td>
														<td width="7%" align="center" bgcolor="#EEEEEE">任课老师</td>
														<td width="4%" align="center" bgcolor="#EEEEEE">教师联系方式</td>
														<td width="19%" align="center" bgcolor="#EEEEEE">操作</td>
													</tr>
													<tr>
														<td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
														<td height="20" bgcolor="#FFFFFF">001</td>
														<td bgcolor="#FFFFFF">Java</td>
														<td bgcolor="#FFFFFF">4</td>
														<td bgcolor="#FFFFFF">2017-02-10</td>
														<td bgcolor="#FFFFFF">2017-02-30</td>
														<td height="20" bgcolor="#FFFFFF">吴老师</td>
														<td height="20" bgcolor="#FFFFFF">13499876543</td>
														<td bgcolor="#FFFFFF"><a href="#">取消该课程</a>&nbsp;|&nbsp;<a href="#">修改</a></td>
													</tr>
													<tr>
														<td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
														<td height="20" bgcolor="#FFFFFF">002</td>
														<td bgcolor="#FFFFFF">大学语文</td>
														<td bgcolor="#FFFFFF">4</td>
														<td bgcolor="#FFFFFF">2017-02-10</td>
														<td bgcolor="#FFFFFF">2017-02-30</td>
														<td height="20" bgcolor="#FFFFFF">赵老师</td>
														<td height="20" bgcolor="#FFFFFF">13499876543</td>
														<td bgcolor="#FFFFFF"><a href="#">取消该课程</a>&nbsp;|&nbsp;<a href="#">修改</a></td>
													</tr>
													<tr>
														<td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
														<td height="20" bgcolor="#FFFFFF">003</td>
														<td bgcolor="#FFFFFF">C++</td>
														<td bgcolor="#FFFFFF">4</td>
														<td bgcolor="#FFFFFF">2017-02-10</td>
														<td bgcolor="#FFFFFF">2017-02-30</td>
														<td height="20" bgcolor="#FFFFFF">黄老师</td>
														<td height="20" bgcolor="#FFFFFF">13499876543</td>
														<td bgcolor="#FFFFFF"><a href="#">取消该课程</a>&nbsp;|&nbsp;<a href="#">修改</a></td>
													</tr>
													<tr>
														<td bgcolor="#FFFFFF"><input type="checkbox" name="delid"/></td>
														<td height="20" bgcolor="#FFFFFF">004</td>
														<td bgcolor="#FFFFFF">数据结构</td>
														<td bgcolor="#FFFFFF">4</td>
														<td bgcolor="#FFFFFF">2017-02-10</td>
														<td bgcolor="#FFFFFF">2017-03-30</td>
														<td height="20" bgcolor="#FFFFFF">刘老师</td>
														<td height="20" bgcolor="#FFFFFF">13499876543</td>
														<td bgcolor="#FFFFFF"><a href="#">取消该课程</a>&nbsp;|&nbsp;<a href="#">修改</a></td>
													</tr>
													
												</table>
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
						<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
							<tr>
								<td height="6"><img src="<%=basePath%>/images/spacer.gif" width="1" height="1" /></td>
							</tr>
							<tr>
								<td height="33">
									<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" class="right-font08">
										<tr>
											<td width="50%">共 <span class="right-text09">5</span> 页 | 第 <span class="right-text09">1</span> 页</td>
											<td width="49%" align="right">[<a href="#" class="right-font08">首页</a> | <a href="#" class="right-font08">上一页</a> | <a href="#" class="right-font08">下一页</a> | <a href="#" class="right-font08">末页</a>] 转至：</td>
											<td width="1%">
												<table width="20" border="0" cellspacing="0" cellpadding="0">
													<tr>
														<td width="1%">
															<input name="textfield3" type="text" class="right-textfield03" size="1" />
														</td>
														<td width="87%">
															<input name="Submit23222" type="submit" class="right-button06" value=" " />
														</td>
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</body>

</html>
