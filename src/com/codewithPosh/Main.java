package com.codewithPosh;

import java.awt.Point;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
	
//	private static int x;
//	private static int y;

	public static void main(String []args) {
		
//		Point point1=new Point(x=1,y=1);
//		Point point2 = point1;
//		point1.x= 4;
//		
		
//		System.out.println(point2);
//		
//		String message="Hello World" + " ! !";  // String is a reference type in JAVA
//		                                        //concordinate String + operator
//		
//		//String is class in Java, so can its members can access using the . operator
//		
//		// String are immutable in Java , original String won't change..
//		
//		System.out.println(message.endsWith("! !"));	
//		System.out.println(message.replace("!", "*"));	
//		
//	}  
		
//		int[]numbers=new int[5];
//		numbers[1]=2;
//		numbers[0]=5;
		
		//if we know the item in arrays, we can code like this
		
//		int[]numbers= {1,2,5,4,6};
//		
//		Arrays.sort(numbers);
//		
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(numbers.length);
//		
		
		//CASTING and TYPE conversion
		
		
		
		
		
		//Math class
		
//		int result=(int)(Math.random()*100);
//		System.out.println(result);
//		
		
		//Format Numbers
		//NumberFormat currency = new NumberFormat() //number format cannot instansiate. because of Abstract class
		
//		NumberFormat currency= NumberFormat.getCurrencyInstance();  //to change the name //Refractor>>Rename 
//		String result=currency.format(12345678);
		
		
//		System.out.println(result);
		
		
//		//Mortgage Calculator
//		final byte Months_in_year=12;
//		final byte Percent =100;
//		
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("Principal:");
//		
//		int principal= scanner.nextInt();
//		
//		System.out.print("Annual Interest Rate:");
//		float annualInterest =scanner.nextFloat();
//		float monthlyInterest= annualInterest/Percent/Months_in_year ;
//		
//		System.out.print("Period(Years):");
//		int years=scanner.nextInt();
//		int numberOfPayments= years*Months_in_year;
//		
//		double mortgage= principal*(monthlyInterest* Math.pow(1+monthlyInterest, numberOfPayments)/(Math.pow(1+monthlyInterest, numberOfPayments)-1));
//		
//		String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
//		System.out.println("Mortgage:" + mortgageFormatted);
//				
		
		//For-Each loop
		
//		String[]fruits = {"Apple", "Orange","Mango"};
//		
//		for(int i=0; i<fruits.length;i++)
//		
//		System.out.println(fruits[i]);
//		
//		for(String fruit:fruits)  // for-Each loop is only forward. //cannot access the index
//		System.out.println(fruit);
		
		
		//Mortgage Calculator//
		
//		final byte Months_in_year=12;
//		final int Percent=100;
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		System.out.print("Principal");
//		
//		int Principal= scanner.nextInt();
//		
//		if  (Principal<1000 )
//			System.out.println("Enter a number between 1000 and 1,000,000. ");
//			
//		else if
//			(1000<Principal>1000000) {
//			
			
			
		
		//Mortgage Calculator
		final byte Months_in_year=12;
		final byte Percent =100;
		int principal=0;
		float monthlyInterest=0;
		int numberOfPayments=0;
		
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			System.out.print("Principal:");
			principal= scanner.nextInt();
			
			if (principal>=1000 && principal<=1000000)
				break;
			System.out.println("Enter a number between 1000 and 1000000");
				
		}
		
		while(true) {
		
			System.out.print("Annual Interest Rate:");
			float annualInterest =scanner.nextFloat();
			
			if (annualInterest>=1  && annualInterest<30) {
				monthlyInterest= annualInterest /Percent/Months_in_year ;
				break;
			}
			System.out.println("Enter a number greater than 0 and less than 30");
			
			
			
		}
		
		
		
		while(true) {
			
			System.out.print("Period(Years):");
			int years=scanner.nextInt();
			
			
			if (years>=1 && years<=30) {
				numberOfPayments= years*Months_in_year;
				break;
			}
				
			System.out.println("Enter a number between 1 and 30");
			
		}
		
		double mortgage= principal*(monthlyInterest* Math.pow(1+monthlyInterest, numberOfPayments)/(Math.pow(1+monthlyInterest, numberOfPayments)-1));
		
		String mortgageFormatted=NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage:" + mortgageFormatted);
			
		}
		
	
		

		
	
		
}
