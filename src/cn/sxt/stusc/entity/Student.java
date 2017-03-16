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
	
	public int getsNO() {
		return sNO;
	}
	public void setsNO(int sNO) {
		this.sNO = sNO;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getClassNO() {
		return classNO;
	}
	public void setClassNO(String classNO) {
		this.classNO = classNO;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
