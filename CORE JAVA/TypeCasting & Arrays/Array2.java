package com.practise;
import java.util.*;

public class Array2
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size : ");
	int Size = sc.nextInt();
	
	int[] arr =new int[Size];
	
	for(int i =0;i<Size ; i++)
	{
		System.out.println("Enter " + i + " value");
		arr[i] =sc.nextInt();
		System.out.println(arr[i]);
	}
	
//	for(int i =0;i<Size ; i++)
//	{
//		System.out.println(arr[i]);
//		System.out.println("Value " + i + " Index value " + arr[i]);
//		
//	}
	System.out.println("-------Array-------");
	System.out.println("Array elements: " + Arrays.toString(arr));
	
		
		
	}

}



/*

output

Enter the array size : 
5
Enter 0 value
85
85
Enter 1 value
90
90
Enter 2 value
95
95
Enter 3 value
75
75
Enter 4 value
70
70
-------Array-------
Array elements: [85, 90, 95, 75, 70]
*/
