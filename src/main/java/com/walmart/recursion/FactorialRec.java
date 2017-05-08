package com.walmart.recursion;

public class FactorialRec {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}
	
	public static long factorial(int n){
		if(n==1){
			//base step
			return 1;
		}else{
			//reduction step
			return n * factorial(n-1);
		}
	}

}
