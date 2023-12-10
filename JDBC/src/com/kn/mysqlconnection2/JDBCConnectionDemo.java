package com.kn.mysqlconnection2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCConnectionDemo {
	public static Scanner sc = new Scanner(System.in);
	private static final String URL = "jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "root";
	private static final String CREATE_TRAINER_QUERY = "CREATE TABLE TRAINER (ID INT, NAME VARCHAR(20)); ";
	private static final String INSERT_TRAINER_QUERY = "INSERT INTO TRAINER VALUES (?,?);";
	private static final String UPDATE_TRAINER_QUERY = "UPDATE TRAINER SET NAME = 'Karan Sir' where id = 2;";
	private static final String DELETE_TRAINER_QUERY = "DELETE FROM TRAINER WHERE ID = 2; ";
	private static final String SELECT_ALL_TRAINER_QUERY = "SELECT * FROM TRAINER ; ";

	public static void main(String[] args) {
		Connection con = null;
		try {
			// 1. Load and Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("==============>Driver Loaded & Registered Successfully.==============>");

			// 2. Establish Connection with DataBase
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("==============>Connection Established Successfully.==============>");

			// 3. Create Statement Object
			Statement stmt = con.createStatement();

			System.out.println(
					"\nSelect options \n\t1. Create Table\n\t2. Insert Data\n\t3. Update Data\n\t4. Delete Data\n\t5. Select Data");
			
			int option = sc.nextInt();

			switch (option) {
			case 1:
				createTable(stmt);
				break;
			case 2:
				insertData(con);
				break;
			case 3:
				updateTable(stmt);
				break;
			case 4:
				deleteTable(stmt);
			case 5:
				selectTable(stmt);
				break;
			default:
			}
			sc.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

	private static void createTable(Statement stmt) throws SQLException {
		stmt.execute(CREATE_TRAINER_QUERY);
		System.out.println("Table Trainer Created Successfully  !");
	}

	private static void insertData(Connection con) throws SQLException {
		System.out.print("Enter Id = ");
		int id = sc.nextInt();
		System.out.println("Name = ");
		String name = sc.next();
		PreparedStatement pstmt = con.prepareStatement(INSERT_TRAINER_QUERY);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.execute();
		System.out.println("Data ("+id +", "+name +") inserted Successfully");
	}

	private static void updateTable(Statement stmt) throws SQLException {
		int rowsAffected = stmt.executeUpdate(UPDATE_TRAINER_QUERY);
		System.out.println(rowsAffected + " rows affected successfully...!");

	}

	public static void deleteTable(Statement stmt) throws SQLException {
		int rowsAffected = stmt.executeUpdate(DELETE_TRAINER_QUERY);
		System.out.println(rowsAffected + " rows affected successfully...!");
	}

	public static void selectTable(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery(SELECT_ALL_TRAINER_QUERY);
		while (rs.next()) {
			System.out.println("ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2));
		}
	}
}
