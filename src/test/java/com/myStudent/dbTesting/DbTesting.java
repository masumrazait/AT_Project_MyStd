package com.myStudent.dbTesting;

import java.sql.SQLException;
import java.util.List;

public class DbTesting {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		DbManager.setMsqlDbConnection();
		List<String>query=DbManager.getMySqlQuery("SELECT * FROM world.country;");
		for(int i=0;i<query.size();i++) {
			System.out.println(query.get(i));
		}
	}

}
