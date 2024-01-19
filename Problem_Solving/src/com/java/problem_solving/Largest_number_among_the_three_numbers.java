package com.java.problem_solving;

public class Largest_number_among_the_three_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=70,c=30;
		
		if(a>b && a>c)
			System.out.println(a + " is the largest Number");
		else if(b>c)
			System.out.println(b + " is the largest Number");
		else
			System.out.println(c + " is the largest Number");
	}

}
