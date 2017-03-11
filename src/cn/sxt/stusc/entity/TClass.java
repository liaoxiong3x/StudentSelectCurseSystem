package cn.sxt.stusc.entity;

public class TClass {
	//班级编号
	private int classNO;
	//班级名
	private String cName;
	//班级教师
	private String chteacher;
	//班级教室
	private int clazzRoom;
	/*
	 * 带参的构造方法
	 */
	public TClass(int classNO, String cName, String chteacher, int clazzRoom) {
		super();
		this.classNO = classNO;
		this.cName = cName;
		this.chteacher = chteacher;
		this.clazzRoom = clazzRoom;
	}
	/*
	 * 无参的构造方法
	 */
	public TClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * 哈希 equels方法
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result
				+ ((chteacher == null) ? 0 : chteacher.hashCode());
		result = prime * result + classNO;
		result = prime * result + clazzRoom;
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
		TClass other = (TClass) obj;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (chteacher == null) {
			if (other.chteacher != null)
				return false;
		} else if (!chteacher.equals(other.chteacher))
			return false;
		if (classNO != other.classNO)
			return false;
		if (clazzRoom != other.clazzRoom)
			return false;
		return true;
	}
	/*
	 * set get 方法
	 */
	public int getClassNO() {
		return classNO;
	}
	public void setClassNO(int classNO) {
		this.classNO = classNO;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getChteacher() {
		return chteacher;
	}
	public void setChteacher(String chteacher) {
		this.chteacher = chteacher;
	}
	public int getClazzRoom() {
		return clazzRoom;
	}
	public void setClazzRoom(int clazzRoom) {
		this.clazzRoom = clazzRoom;
	}
	@Override
	public String toString() {
		return "TClass [classNO=" + classNO + ", cName=" + cName
				+ ", chteacher=" + chteacher + ", clazzRoom=" + clazzRoom + "]";
	}
	
	
}
