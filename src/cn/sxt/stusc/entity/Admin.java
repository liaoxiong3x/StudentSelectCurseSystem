package cn.sxt.stusc.entity;

import java.util.Date;

public class Admin {
	//用户ID
	private String userID;
	//用户名
	private String username;
	//用户密码
	private String password;
	//用户年龄
	private int age;
	//分数
	private double score;
	//入职日期	
	private Date enterDate;
	//爱好
	private String hobby;
	
	/*
	 * 带参的构造方法
	 */
	public Admin(String userID, String username, String password, int age,
			double score, Date enterDate, String hobby) {
		super();
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.age = age;
		this.score = score;
		this.enterDate = enterDate;
		this.hobby = hobby;
	}
	/*
	 * 无参的构造方法
	 */
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 哈希和equels
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result
				+ ((enterDate == null) ? 0 : enterDate.hashCode());
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		long temp;
		temp = Double.doubleToLongBits(score);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((userID == null) ? 0 : userID.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
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
		Admin other = (Admin) obj;
		if (age != other.age)
			return false;
		if (enterDate == null) {
			if (other.enterDate != null)
				return false;
		} else if (!enterDate.equals(other.enterDate))
			return false;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (Double.doubleToLongBits(score) != Double
				.doubleToLongBits(other.score))
			return false;
		if (userID == null) {
			if (other.userID != null)
				return false;
		} else if (!userID.equals(other.userID))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	/*
	 * set get 方法 
	 */
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Date getEnterDate() {
		return enterDate;
	}
	public void setEnterDate(Date enterDate) {
		this.enterDate = enterDate;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "Admin [userID=" + userID + ", username=" + username
				+ ", password=" + password + ", age=" + age + ", score="
				+ score + ", enterDate=" + enterDate + ", hobby=" + hobby + "]";
	}
	
	
}
