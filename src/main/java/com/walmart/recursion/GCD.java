package com.walmart.recursion;


//http://introcs.cs.princeton.edu/java/23recursion/Euclid.java.html
public class GCD {

	public static void main(String[] args) {
		System.out.println("gcd(700,28)->"+gcd(700,26));

	}
	
	public static int gcd(int p, int q){
		if(q==0){
			return p;
		}else{
			return gcd(q,p%q);
		}
	}

}
