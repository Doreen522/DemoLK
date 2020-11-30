package com.codewithPosh;

import java.util.Scanner;

public class Arithmatic {
 
	
	
	public static void convertBinary(int decimal) {
		 
		
		int index=0;
		int Binary[] = new int [40];
		
		while (decimal > 0) {
			 Binary [index++ ]= decimal % 2 ;
			 
			 decimal = decimal /2;
					
		}
		
		//System.out.println(index-1);
		
		for (int i=(index-1); i >= 0; i--) {
			System.out.print(Binary[i]);
			
		}
		
		
	}
	
	
	public static void main (String[] args){
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number within 40 : ");
		
		int number= in.nextInt();
		
		convertBinary(number);
		
		
		
		
	}
	
}
