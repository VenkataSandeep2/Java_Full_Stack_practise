package com.practise;

import java.util.*;

public class Exp2 {

	public static void main(String[] args) 
	{
		int a,b,c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 2 values : ");
		try 
		{
		a = sc.nextInt();
		b = sc.nextInt();
		c = a/b ;
		System.out.println("The result is :- " + c);
		}
		 catch(InputMismatchException ime)
		 {
			System.out.println(ime); 
		 }
			 
	System.out.println("Hiiiiiiiiii");
	}


}

//output
1  ]) Enter a 2 values :       
      11                
      5                 
      The result is :- 2        
      Hiiiiiiiiii
2  ]) Enter a 2 values : 
      52
      s
      java.util.InputMismatchException
      Hiiiiiiiiii

  

