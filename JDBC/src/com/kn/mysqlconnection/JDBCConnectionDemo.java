package com.kn.mysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionDemo {

	public static void main(String[] args) {
		String URl = "jdbc:mysql://localhost:3306/university";
		String USER_NAME = "root";
		String PASSWORD = "root";
		String CREATE_STUDENT_QUERY = "CREATE TABLE STUDENT (ID INT, NAME VARCHAR(20), MARKS INT);";
		String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT VALUE (1,'RAM',100);";
		String UPDATE_STUDENT_QUERY = "UPDATE STUDENT SET NAME = 'SHRI RAM' WHERE ID = 1;";
		String DELETE_STUDENT_QUERY = "DELETE FROM STUDENT WHERE ID = 1;";

		try {
			// 1. Load & Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// FQCN(Fully Qualified Class Name ) - Canonical Name
			System.out.println("==============>Driver Loaded & Registered Successfully.==============>");

			// 2. Establish the Connection with Database
			Connection con = DriverManager.getConnection(URl, USER_NAME, PASSWORD);
			System.out.println("==============>Connection Established Successfully.==============>");

			// 3. Create Statement Objects
			Statement stmt = con.createStatement();

			// 4. Send & Execute Query
//			stmt.execute(CREATE_STUDENT_QUERY);
//			System.out.println("==============>Student Table Created Successfully !!!");

			int rowsAffected = stmt.executeUpdate(INSERT_STUDENT_QUERY);
			System.out.println(rowsAffected+" rows affected.");

//			int rowsAffected = stmt.executeUpdate(UPDATE_STUDENT_QUERY);
//			System.out.println(rowsAffected+" rows affected.");

//			int rowsAffected = stmt.executeUpdate(DELETE_STUDENT_QUERY);
//			System.out.println(rowsAffected + " rows affected.");

		} catch (ClassNotFoundException e) {
			System.out.println("Driver Not Found");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Failed to Establish Connection");
			e.printStackTrace();
		}

	}

}
