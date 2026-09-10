package com.test;

import com.model.Employee_1;

public class Main_1 
{
	public static void main(String[] args) 
	{
	
		Employee_1 emp1 = getEmployee();
		System.out.println(emp1.hashCode());
		

		Employee_1 emp2 = getEmployee();
		System.out.println(emp2.hashCode());
		

		Employee_1 emp3 = getEmployee();
		System.out.println(emp3.hashCode());
	}
	
	
	
	
	public static Employee_1 getEmployee()
	{
		Employee_1 emp = new Employee_1();
		return emp;
		
	}

}
