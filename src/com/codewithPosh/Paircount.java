package com.codewithPosh;

public class Paircount {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		int arrA[] = {7,9,11,13,15};
//		int number = 20;
//		int indexTotal = 0;
//		for(int i=0; i<5; i++ ) {
//			for(int j=i+1; j<5; j++) {
//				
//					if( arrA[i]+ arrA[j]==20) {
//						indexTotal += (i+j);
//						System.out.println(arrA[i]+ " "+ arrA[j]);	
//						System.out.println(indexTotal);	
		int array[]= {7,9,11,13,15}	;			
				
		pairwise(array, 20);
	}
		
		
					

			
			//System.out.println(indexTotal);
		
	

	
	
	public static void pairwise(int arr[], int num) {
		//int arrA[] = {7,9,11,13,15};
		//int number = 20;
		int indexTotal = 0;
		for(int i=0; i<5; i++ ) {
			for(int j=i+1; j<5; j++) {
				
					if( arr[i]+ arr[j]==num) {
						indexTotal+= (i+j);
						System.out.println(arr[i]+ " "+ arr[j]);	
						System.out.println(indexTotal);	
						
					}	
				
			}
}
	}
	}