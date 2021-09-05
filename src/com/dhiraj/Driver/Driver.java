package com.dhiraj.Driver;
import com.dhiraj.assignment.*;

public class Driver {

public static void main (String[]args) {
	
	//Create the object
	
	
	
	//obj1.doActivity(); to get output from this line sysout in doactivity in Hrdepartment class
	
	//String Hr = obj1.doActivity();
	
	// object for Admin department
	
	AdminDepartment admin1 = new AdminDepartment();
	System.out.println(admin1.departmentName());
	
	AdminDepartment admin2 = new AdminDepartment();
	System.out.println(admin2.getTodaysWork());
	
	AdminDepartment admin3 = new AdminDepartment();
	System.out.println(admin3.getWorkDeadline());
	
	AdminDepartment admin4 = new AdminDepartment();
	System.out.println(admin4.doActivity());
	System.out.println();
	
	// object for Hr department
	
	HrDepartment hr5 = new HrDepartment();
	System.out.println(hr5.departmentName());
	
	HrDepartment hr1 = new HrDepartment();
	System.out.println(hr1.doActivity());
	
	HrDepartment hr2 = new HrDepartment();
	System.out.println(hr2.getTodaysWork());
	
	HrDepartment hr3 = new HrDepartment();
	System.out.println(hr3.getWorkDeadline());
	
	SuperDepartment hr4 = new SuperDepartment();
	System.out.println(hr4.doActivity());
	System.out.println();
	
	
	// object for Tech department
	
	TechDepartment tech1 = new TechDepartment();
	System.out.println(tech1.departmentName());
	
	TechDepartment tech2 = new TechDepartment();
	System.out.println(tech2.getWorkDeadline());
	
	TechDepartment tech3 = new TechDepartment();
	System.out.println(tech3.getTechStackInformation());
	
	TechDepartment tech4 = new TechDepartment();
	System.out.println(tech4.doActivity());
	
	
	
	
	
	
	
	
}
}
