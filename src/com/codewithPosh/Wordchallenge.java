package com.codewithPosh;

import java.util.Scanner;

public class Wordchallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Input a String: ");
		String write= input.nextLine();
		reverse(write);
		
		revString(write);
		

	}
	
	public static void reverse(String write) {
		char[]ch=new char [write.length()];
		
		//copy to Array
		for(int i= write.length()-1; i >=0; i--) {
			ch[i]=write.charAt(i);
			
			System.out.print("The word rev is: " +ch[i]);	
			
		}
		
		}
	public static void revString(String write) {
		
		int i= write.length()-1;
		
		while (i >= 0) {
			System.out.print("The Rev word is: " +write.charAt(i));
			
			i--;
			
		}
		
		}
		
	
	
	

}
