package com.codewithPosh;

import java.util.Scanner;

public class convertToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num= input.nextInt();
		
		convertNum(num);

	}
	
	public static void convertNum(int decimal) {
		int Tempstorebin[]= new int [40];
		int index=0;
		while(decimal > 0) {
		
			Tempstorebin[index]= decimal % 2;
				index++;
		
			decimal= decimal/2;
			
	   }
		for(int i=index-1; i >= 0; i--) {
			System.out.print(Tempstorebin[i]);
			
		}
	
	}
	
	

}
