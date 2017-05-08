// Given a set of 'valid' characters: ( ) [ ] a-Z { } < >
// And a string on input (any string possible)
// I'd like to know if that string is valid, meaning it contains only characters from the given set 
// And that parenthesis nesting order is respected ([]) ((()))[] ...

// "Hello Sachin" --> Invalid
// "HelloSachin123$#" --> Invalid
// "Hello(Sachin)" --> Valid
// "HEllo(Sachin" --> Invalid


public class StringOPPP{

private char[] validChars = {'(',')'}; // All valid chars ( ) [ ] a-Z { } < >


private static boolean isValidChars(String input){

boolean isValidInput=false;

char[] inputCharArr = input.toCharArray();

int[] counterArr = new int[]{0,0,0,0};
int recentCounterTypeIndex = -1; //0 () 1[] 2{} 3<>

// "abc(def[fg)]"

for(int i=0;i<inputCharArr.length;i++){

    char eachChar = inputCharArr[i]; 
    boolean isValidChar = false;
//    for(int j=0;j<validChars.length;j++){
//          if(eachChar==validChars[j]){
//           isValidChar = true;
//           
//           
//           
//           break;//breaking inner loop
//           }  
//    }
    
    if(!isValidChar){
    isValidInput = false;
    break; //breaking outer loop
    }
    
    }
    
return isValidInput;
}

}
