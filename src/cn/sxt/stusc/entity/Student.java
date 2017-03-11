package cn.sxt.stusc.entity;

import java.util.Date;

public class Student {
	//学生编号
	private int sNO;
	//学生密码
	private String pwd;
	//学生姓名
	private String sName;
	//电话号码
	private String phone;
	//性别
	private char gender; 
	//生日
	private Date birth;
	//班级名
	private String classNO;
	//描述
	private String remark;
	
	/*
	 *  带参的构造方法 
	 */
	public Student(int sNO, String pwd, String sName, String phone,
			char gender, Date birth, String classNO, String remark) {
		super();
		this.sNO = sNO;
		this.pwd = pwd;
		this.sName = sName;
		this.phone = phone;
		this.gender = gender;
		this.birth = birth;
		this.classNO = classNO;
		this.remark = remark;
	}
	/*
	 * 无参的构造方法
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * 重写toString方法
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [sNO=" + sNO + ", pwd=" + pwd + ", sName=" + sName
				+ ", phone=" + phone + ", gender=" + gender + ", birth="
				+ birth + ", classNO=" + classNO + ", remark=" + remark + "]";
	}
	
	
}
