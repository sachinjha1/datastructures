package com.walmart.s2jha.puzzle;

/**
 * https://careercup.com/question?id=5753530796212224
 * @author s2jha
 *
 */
public class ShortestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[256];
		String input = "abc";
		for(int i=0;i<input.length();i++){
			arr[input.charAt(i)]++;
			System.out.println(arr[input.charAt(i)]);
		}
		for(int i=0;i<256;i++){
		System.out.println(arr[i]);
		}

	}

}
/*
 * String str="abbca";
 * String match="abc";
 * String
 * for(i:str.charArray()){
 * for(j:match.charArray()){
 *   if(str[i]==match[j]){
 *   for(k:match.charArray && k!=j){
 *   
 *   }
 *   break;
 *   }
 * }
 * 
 * 
 * }
 * 
 * 
 */
