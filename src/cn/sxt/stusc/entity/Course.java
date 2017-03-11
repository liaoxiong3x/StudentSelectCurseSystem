package cn.sxt.stusc.entity;

import java.util.Date;

public class Course {
	//课程NO
	private int cNO;
	//课程名
	private String nameString;
	//学分
	private int credit;
	//开始日期
	private Date periodStart;
	//结束日期
	private Date periodEnd;
	/*
	 * 无参的构造方法
	 */
	public Course() {
		super();
	}
	/*
	 * 带参的构造方法
	 */
	public Course(int cNO, String nameString, int credit, Date periodStart,
			Date periodEnd) {
		super();
		this.cNO = cNO;
		this.nameString = nameString;
		this.credit = credit;
		this.periodStart = periodStart;
		this.periodEnd = periodEnd;
	}
	/*
	 * 哈希 equels方法
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cNO;
		result = prime * result + credit;
		result = prime * result
				+ ((nameString == null) ? 0 : nameString.hashCode());
		result = prime * result
				+ ((periodEnd == null) ? 0 : periodEnd.hashCode());
		result = prime * result
				+ ((periodStart == null) ? 0 : periodStart.hashCode());
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
		Course other = (Course) obj;
		if (cNO != other.cNO)
			return false;
		if (credit != other.credit)
			return false;
		if (nameString == null) {
			if (other.nameString != null)
				return false;
		} else if (!nameString.equals(other.nameString))
			return false;
		if (periodEnd == null) {
			if (other.periodEnd != null)
				return false;
		} else if (!periodEnd.equals(other.periodEnd))
			return false;
		if (periodStart == null) {
			if (other.periodStart != null)
				return false;
		} else if (!periodStart.equals(other.periodStart))
			return false;
		return true;
	}
	/*
	 * set ,get方法
	 */
	public int getcNO() {
		return cNO;
	}

	public void setcNO(int cNO) {
		this.cNO = cNO;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public Date getPeriodStart() {
		return periodStart;
	}

	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}

	public Date getPeriodEnd() {
		return periodEnd;
	}

	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}

	/*
	 * 重写toString
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [cNO=" + cNO + ", nameString=" + nameString
				+ ", credit=" + credit + ", periodStart=" + periodStart
				+ ", periodEnd=" + periodEnd + "]";
	}
	
	
}
