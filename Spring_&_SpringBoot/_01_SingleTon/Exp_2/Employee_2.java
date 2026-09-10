package com.model;

public class Employee_2 
{
	private int emp_id;
	
	private static Employee_2 emp;
	
	private  Employee_2()
	{
		
	}
	
	public static Employee_2 getEmployee_2Instance()
	{
		if(emp ==null)
		{
			emp = new Employee_2();
		//	return emp;
		}
		return emp;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + "]";
	}
	

}
