package com.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class LetterCombinationsOfAPhoneNumber {
	
	public static Scanner scan= new Scanner(System.in);
	
	public static String input() {
		
		String numb=String.valueOf(scan.nextInt());
		
		return numb;
		
		
	}
	
	
public static List<String> letterCombinations(String digits) {

	LinkedList<String> output=new LinkedList<>();// act as a queue as well.
    
    if(digits.length()==0) return output;
     output.add("");// adding things
     
     String [] char_map=new String [] {"0", "1", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};
     
     for(int i=0; i<digits.length();i++){
         
         
         int index=Character.getNumericValue(digits.charAt(i));// gives us the integer value of the current character.
         System.out.print(index+"<----");
         
         while(output.peek().length()==i){// if the length is equal to zero, which is
             String permutation=output.remove();// popping the thing off
             System.out.println(permutation+" permutRemov "+output);
             
             for(char ka: char_map[index].toCharArray()){// looping through the characters that the index represents.
               
                 output.add(permutation+ka);
             
                 
                 
             }
             
             
             
         }
         
         
     }
     
     return output;
 }
public static void main(String[] args) {
	System.out.println(letterCombinations(input()));
	
}
        
    
	

}
