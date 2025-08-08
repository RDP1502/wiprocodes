package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static String url = "jdbc:mysql://localhost:3306/wiprojdbc";
    static String userName = "root";
    static String passWord = "cremune@2025";
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Menu--");
        System.out.println("Insert 1 for add Employee");
        System.out.println("Insert 2 for print Employee");
        int option = sc.nextInt();
        switch(option) {
        case 1:
        	addData();
        	break;
        case 2:
        	printData();
        	break;
        case 3:
        	return;
        default:
        	System.out.println("Invalid input");
        	
        }
   
    }
    static void addData() {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Age: ");
        int empAge = sc.nextInt();
    	try {
			Connection conn = DriverManager.getConnection(url,userName,passWord);
			Statement stmt = conn.createStatement();
			
			String insertSQL = "insert into employee(empId,empName,empAge,empDept)"
					+"values(empId,'Rohan',4)";
			stmt.execute(insertSQL);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    static void printData() {
    	Connection conn;
		try {
			conn = DriverManager.getConnection(url,userName,passWord);
			Statement stmt = conn.createStatement(); 
			ResultSet rs = stmt.executeQuery("Select * from employee");
			if(rs.next()) {
				System.out.println("Employee Id = "+rs.getString(1)+" Employee Name = "+ rs.getString(2)
				+" Employee Age = "+ rs.getInt(3));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
