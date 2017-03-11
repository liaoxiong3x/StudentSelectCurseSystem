package cn.sxt.stusc.entity;

import java.util.Date;

public class Teacher {
	//教师编号
	private int tNO;
	//教师姓名
	private String tName;
	//教师密码
	private String pwd;
	//电话
	private String phone;
	//入职日期
	private Date hiredate;
	//简介
	private String remark;
	/*
	 * 不带参的构造方法
	 */
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * 带参的构造方法
	 */
	public Teacher(int tNO, String tName, String pwd, String phone,
			Date hiredate, String remark) {
		super();
		this.tNO = tNO;
		this.tName = tName;
		this.pwd = pwd;
		this.phone = phone;
		this.hiredate = hiredate;
		this.remark = remark;
	}
	/*
	 * 哈希equels方法
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((hiredate == null) ? 0 : hiredate.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((remark == null) ? 0 : remark.hashCode());
		result = prime * result + tNO;
		result = prime * result + ((tName == null) ? 0 : tName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (hiredate == null) {
			if (other.hiredate != null)
				return false;
		} else if (!hiredate.equals(other.hiredate))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (remark == null) {
			if (other.remark != null)
				return false;
		} else if (!remark.equals(other.remark))
			return false;
		if (tNO != other.tNO)
			return false;
		if (tName == null) {
			if (other.tName != null)
				return false;
		} else if (!tName.equals(other.tName))
			return false;
		return true;
	}
	/*
	 * set get方法
	 */
	public int gettNO() {
		return tNO;
	}

	public void settNO(int tNO) {
		this.tNO = tNO;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getHiredate() {
		return hiredate;
	}
	
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	/*
	 * 重写toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [tNO=" + tNO + ", tName=" + tName + ", pwd=" + pwd
				+ ", phone=" + phone + ", hiredate=" + hiredate + ", remark="
				+ remark + "]";
	}
	
}
