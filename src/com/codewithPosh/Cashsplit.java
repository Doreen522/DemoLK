package com.codewithPosh;

import java.util.Scanner;

public class Cashsplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner (System.in);
		System.out.print("Enter number: ");
		int number = in.nextInt();
		
		split(number); 
		//int arr[0]=500/1000;

	}
	
	
	public static void split(int num) {
		
		int cash[]= {5000,1000,500,100,50,20,10,5,2,1};
		int count[] = new int[10];
		
			 
			for(int i= 0; i < 10; i++) {
				
				count[i] = num /cash[i];
				
				num=num % cash[i];
				}
				
			
			for(int j =0; j < 10; j++) {
				System.out.println(count[j]);
			
		}
		
		
		
		
	}

}
