package com.java.problem_solving;

public class PrimeNumber_Or_Not {

	public static void main(String[] args) {
		int n=18;
		int flag=0;
		
		 for(int i=2;i<n;i++) {
			 if(n%i==0) {
				 flag=1;
				 break;
			 }
		 }
		 
		 if(flag==0) {
			 System.out.println(n + " is a prime Number");
		 }
		 else {
			 System.out.println(n + " is not prime Number");
		 }
	}

}
