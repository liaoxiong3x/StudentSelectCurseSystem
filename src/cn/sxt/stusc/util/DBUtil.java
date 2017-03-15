package cn.sxt.stusc.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBUtil {
		
	  /**
	   * 获取数据库连接
	   * @return
	   */
	  public static Connection getConn(){
		  //给一个null的Connection对象
		  Connection conn=ConnectPoolFactory.getInstance().getConnect();
		 return conn;
	  }
	  
	  /**
	   *  获取静态sql处理Statement对象
	   * @param conn
	   * @return
	   */
	  public static Statement getStatement(Connection conn){
		  //给一个null的Statement对象
		  Statement stmt=null;
		  
		  try {
			stmt=conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  return stmt;
	  }
	  
	  /**
	   * 获取动态sql预处理PreparedStatement对象
	   * @param conn
	   * @param sql
	   * @return
	   */
	  public static PreparedStatement getPreparedStatement(Connection conn,String sql){
		  //给一个null的PreparedStatement对象
		  PreparedStatement pstmt=null;
		  try {
			pstmt=conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 return pstmt; 
	  }
	 
	  /**
	   * 关闭资源:注意关闭顺序  rs ----》  stmt----》  conn
	   * @param conn
	   * @param stmt
	   * @param rs
	   */
	  public static void closeAll(Connection conn,Statement stmt,ResultSet rs){
		  if(rs!=null){
			  try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  }
		  
		  if(stmt!=null){
			  try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  }
		  if(conn!=null){
			  try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		  }
	  }
	}
