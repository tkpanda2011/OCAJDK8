package com.aurotech.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.aurotech.dto.Employee;

public class PersistancePool {
public static final String JDBC_DRIVER="oracle.jdbc.driver.OracleDriver";
public static final String URL="jdbc:oracle:thin:@localhost:1521:ORACLE";
public static final String USERNAME="hr";
public static final String PASSWORD="hr";
private static Connection conn;
private static PreparedStatement ps;
private static ResultSet rs;
static {
	System.out.println("hello 1234"+conn);
	try {
		System.out.println("hello"+conn);
		Class.forName( JDBC_DRIVER ) ;
		conn = DriverManager.getConnection(URL,USERNAME,PASSWORD  ) ;
		System.out.println("hello"+conn);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
}
public static Collection<Employee> getEmployees(){
	Collection<Employee> employeeList=new ArrayList<Employee>();
	try {
		System.out.println("hello1");
		 ps=conn.prepareStatement("SELECT * FROM EMPLOYEES");
		 System.out.println("hello2");
		 rs=ps.executeQuery();
		 String fullName;
		 Employee emp;
		 System.out.println("hello");
		 while(rs.next()){
			 emp=new Employee();
			 fullName=new String("");
			emp.setEmployeeID( rs.getInt("EMPLOYEE_ID"));
			 if( rs.getString("FIRST_NAME")!=null &&  rs.getString("FIRST_NAME").trim().length()>0){
				 fullName=fullName+rs.getString("FIRST_NAME");
			 }
			 fullName=fullName+rs.getString("LAST_NAME");
			 emp.setFullName(fullName);
			emp.setEmail( rs.getString("EMAIL"));
			 if( rs.getString("PHONE_NUMBER")!=null &&  rs.getString("PHONE_NUMBER").trim().length()>0){
				 emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
			 }
			 emp.setJobID(rs.getString("JOB_ID"));
			emp.setHireDate( rs.getDate("HIRE_DATE"));
			 
			 if( rs.getDouble("SALARY")>0.0){
				 emp.setSalary(rs.getDouble("SALARY"));
			 }
			 if( rs.getDouble("COMMISSION_PCT")>0.0){
				 emp.setCommision(rs.getDouble("COMMISSION_PCT"));
			 }
			 if( rs.getInt("MANAGER_ID")>0){
				 emp.setManager(rs.getInt("MANAGER_ID"));
			 }
			 if( rs.getInt("DEPARTMENT_ID")>0){
				emp.setManager( rs.getInt("DEPARTMENT_ID"));
			 }
			 employeeList.add(emp);
			
		 }
		 

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(employeeList.size());
	return employeeList;
	
}
public static void main(String []args){

	System.out.println("hello"+conn);
	System.out.println(PersistancePool.getEmployees());
}
}
