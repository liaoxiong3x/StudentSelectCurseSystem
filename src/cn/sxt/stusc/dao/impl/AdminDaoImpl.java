package cn.sxt.stusc.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

import cn.sxt.stusc.dao.AdminDao;
import cn.sxt.stusc.entity.Admin;
import cn.sxt.stusc.util.DBUtil;



public class AdminDaoImpl implements AdminDao{
	@Override
	public Admin findAdmin(String userID, String password)  {
		Admin admin = new Admin();
		//创建连接
		Connection connection = null;
		//建立命令发射器
		PreparedStatement ps = null;
		//创建sql语句
		String sql = "select * from t_admin where userid=? and password=?";
		//发送命令并去的结果
		ResultSet resultSet = null;
		try {
			connection = DBUtil.getConn();
			ps = DBUtil.getPreparedStatement(connection, sql);
			ps.setString(1, userID);
			ps.setString(2, password);
			resultSet = ps.executeQuery();
			if (resultSet.next()) {
				admin.setUserID(resultSet.getString("USERID"));
				admin.setUsername(resultSet.getString("USERNAME"));
				admin.setPassword(resultSet.getString("PASSWORD"));
				admin.setScore(resultSet.getDouble("score"));
				admin.setHobby(resultSet.getString("HOBBY"));
				admin.setEnterDate(resultSet.getDate("enterDate"));
				admin.setAge(resultSet.getInt("AGE"));
			}
		} catch (SQLException e) {
//			e.fillInStackTrace();
		}finally{
			DBUtil.closeAll(connection, ps, resultSet);
		}
		return admin;
	}
	@Override
	public int saveAdmin(Admin admin) {
		//创建连接
		Connection connection = null;
		//建立命令发射器
		PreparedStatement ps = null;
		//创建sql语句
		String sql = "insert into t_admin values(?,?,?,?,?,?,?)";
		//发送命令并去的结果
		ResultSet resultSet = null;
		int flag = 0;
		try {
			connection = DBUtil.getConn();
			ps = DBUtil.getPreparedStatement(connection, sql);
			ps.setString(1, admin.getUserID());
			ps.setString(2, admin.getUsername());
			ps.setString(3, admin.getPassword());
			ps.setInt(4, admin.getAge());
			ps.setDouble(5, admin.getScore());
			ps.setDate(6, new java.sql.Date(admin.getEnterDate().getTime()));
			ps.setString(7, admin.getHobby());
			flag = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.closeAll(connection, ps, resultSet);
		}
		return flag;
	}
}
