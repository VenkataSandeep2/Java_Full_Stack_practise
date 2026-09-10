package com.test;

import com.model.Employee_2;

public class Main_2
{
	public static void main(String[] args) 
	{
		
		Employee_2 emp1 = getEmployee();
		System.out.println(emp1.hashCode());
		

		Employee_2 emp2 = getEmployee();
		System.out.println(emp2.hashCode());
		

		Employee_2 emp3 = getEmployee();
		System.out.println(emp3.hashCode());
	
	}
	
	public static Employee_2 getEmployee()
	{
		Employee_2 emp = Employee_2.getEmployee_2Instance();
		return emp;
	}

}

				
				// OUTPUT
				// 	617901222
				// 	617901222
				// 	617901222
