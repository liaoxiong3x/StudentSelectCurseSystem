package cn.sxt.stusc.dao;

import cn.sxt.stusc.entity.Admin;



public interface AdminDao {
	/*
	 * 查找帐号
	 */
	public Admin findAdmin(String userID,String password);
	/*
	 * 保存账号
	 */
	public int saveAdmin(Admin admin);
}
