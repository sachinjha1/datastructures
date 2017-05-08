package com.walmart.s2jha.puzzle;

public class CharacterCount {

	public static void main(String[] args) {
     charFreq("aaabbccccd");
	}
	
	public static String charFreq(String input){
		StringBuilder output=new StringBuilder();
		Character ch = null;
		int count = 0;
		for(char eachC: input.toCharArray()){
			if(ch != null && eachC != ch){
				output.append(count).append(ch);
				ch = eachC;
				count=1;
			}else{
				ch = eachC;
				count++;
			}
		}	
		//Last set of character not handled in above for loop
		output.append(count).append(ch);
		return output.toString();
	}

}
