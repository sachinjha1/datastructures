package com.walmart.s2jha.puzzle;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
	 Say I have a bunch of coins in my pocket, which we can represent as an array like so: 
	[1,5,5,10] 
	
	What are the number of unique sums of money that I might get if I just randomly grab some coins from my pocket? 
	Implement a function that takes the array as an argument and returns the number of unique possible sums.
	
	
	Once done lemme know I will share my solution.
	
	Good place to try for more:
	http://www.geeksforgeeks.org
 */
public class PocketCoins {
	private static Integer coins[] = {1,5,5,10};
	private static Set combinations = new LinkedHashSet<Integer>();
	private static Set<Integer> combinationsTemp = null;

	public static void main(String[] args) {
		for(int coinNbr=0;coinNbr<coins.length;coinNbr++){
			combinationsTemp = new HashSet<>(combinations); //Storing existing combinations in temp
			combinations.add(coins[coinNbr]);//Each coin alone is also a combination
			
			//Add new coin value on all existing combinations as a list of new combinations
			for(Integer existingComb: combinationsTemp){
			  combinations.add(existingComb+coins[coinNbr]);
			}
		}
		System.out.println(combinations);
	}
	

}
