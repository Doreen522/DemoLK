package com.codewithPosh;

public class Palindromewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findPalindrome();

	}
	
	
	public static void findPalindrome() {
		String words[]= {"ana","Gowtham","did","ini","work","wow","talent"};
		//String palWords[];
		
		
		
		for(int i=0; i < words.length; i++) {
			String Forwd= words[i];
			
			StringBuffer sb = new StringBuffer(Forwd);
			sb.reverse();
			
			String Rev= sb.toString();
			
			if (Forwd.equals(Rev)) {
				System.out.println(Forwd);
			}
			
//			char[]pal1=new char [words[0].length()];
//			 pal1[i]=  words[0].charAt(i);
//			 
//		     System.out.println(pal1[i]);
			
			
		}
		
		 //System.out.println(pal1);
		
		
		
		//System.out.println(words.length);
	}

}