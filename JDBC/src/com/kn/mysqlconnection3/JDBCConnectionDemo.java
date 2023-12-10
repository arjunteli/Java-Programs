package com.kn.mysqlconnection3;

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
	private static final String INSERT_EMPLOYEE_QUERY = "INSERT INTO EMPLOYEE VALUES (?,?,?);";
	private static final String UPDATE_EMPLOYEE_QUERY = "UPDATE EMPLOYEE SET SALARY = (SALARY+1000) where id = ?;";
	private static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM EMPLOYEE WHERE ID = ?; ";
	private static final String SELECT_ALL_EMPLOYEE_QUERY = "SELECT * FROM EMPLOYEE ; ";
	private static final String SELECT_DATA_EMPLOYEE_QUERY = "SELECT * FROM EMPLOYEE WHERE ID = ? ; ";
	private static Connection con = null;

	public static void main(String[] args) {

		try {
			// 1. Register Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Establish Connection with DataBase
			con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			boolean bl = true;
			while (bl) {
				System.out.println(
						"\nSelect options \n\t1. Insert\n\t2. Update Data  Data\n\t3. Delete Data \n\t4. Select Data\n\t5. Select Particular Data\n\t6. Quit");
				int option = sc.nextInt();
				switch (option) {
				case 1:
					insertData(con);
					break;
				case 2:
					updateData(con);
					break;
				case 3:
					//deleteData(con);
					break;
				case 4:
					selectData(con);
					break;
				case 5:
					System.out.println("Id = ");
					int id = sc.nextInt();
					selectParticularData(con, id);
					break;
				case 6:
					bl = false;
					System.out.println("Thank you for Using Application !!!!!!!!!!!!");
					break;
				default:
					System.out.println("Invalid Parameter");
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void selectParticularData(Connection con, int id) {
		String query = "select * from employee where id ="+id+";";
		try {
			Statement stmt = con.createStatement();
			stmt = con.createStatement();
			ResultSet rs;
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2)+", Salary = "+rs.getDouble(3));
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void updateData(Connection con) {
		try {
			PreparedStatement pstmt = con.prepareStatement(UPDATE_EMPLOYEE_QUERY);
			System.out.print("Enter Id = ");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			pstmt.execute();
			selectParticularData(con, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void selectData(Connection con) {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(SELECT_ALL_EMPLOYEE_QUERY);
			while(rs.next()) {
				System.out.println("ID = " + rs.getInt(1) + ", NAME = " + rs.getString(2)+", Salary = "+rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertData(Connection con) {
		try {
			PreparedStatement pstmt = con.prepareStatement(INSERT_EMPLOYEE_QUERY);
			System.out.print("Enter id = ");
			int id = sc.nextInt();
			System.out.print("Name = ");
			String name = sc.next();
			System.out.print("Salary = ");
			double salary = sc.nextDouble();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setDouble(3, salary);
			pstmt.executeUpdate();
			selectData(con);
		} catch (
				Exception e) {
			e.printStackTrace();
		}

	}

}
