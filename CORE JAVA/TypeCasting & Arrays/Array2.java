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
