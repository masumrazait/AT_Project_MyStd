package com.myStudent.dbTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.myStudent.utilities.TestConfig;

public class DbManager {
	private static Connection con =null;
	private static Connection conn =null;
	
	public static void setDbConnection() {
		try {
			Class.forName(TestConfig.driver);
			con = DriverManager.getConnection(TestConfig.dbConnectionUrl,TestConfig.dbUserName,TestConfig.dbPassword);
			
			if(!con.isClosed())
				System.out.println("SuccessFully Connected to SQL Server");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception : " + e.getMessage());
		}
	}
	
	public static void setMsqlDbConnection() {
		try {
			Class.forName(TestConfig.mysqldriver).newInstance();
			conn=DriverManager.getConnection(TestConfig.mysqlurl,TestConfig.mysqluserName,TestConfig.mysqlpassword);
			
			if(!conn.isClosed())
				System.out.println("Successfull connected to the MySQL Server");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Cannot Connected to the Database Server");
		}
	}
	
	
	public static List<String>getMySqlQuery(String query)throws SQLException{
		Statement St =conn.createStatement();
		ResultSet rs=St.executeQuery(query);
		List<String>values1=new ArrayList<String>();
		while(rs.next()) {
			values1.add(rs.getString(1));
			values1.add(rs.getString(2));
			values1.add(rs.getString(3));
			values1.add(rs.getString(4));
		}
	
		return values1;
	}

}
