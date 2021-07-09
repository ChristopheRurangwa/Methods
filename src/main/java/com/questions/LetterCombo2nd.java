package com.questions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombo2nd {
	
	public List<String> letterCombinations(String digits) {
		
        List<String> result=new ArrayList<String>();
        if(digits==null||digits.length()==0){//error checking; nothing to process.
            
            return result;
        }
        String [] mapping= {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
   letterCombRecursv(result,digits,"", 0, mapping);
       return result;
    }
   
        
   public void letterCombRecursv(List<String> result,String digits,String current,int index,String[] mapping){
       // need a base case for our recursion function; a place to know when to stop.
       if(index==digits.length()){// tells if we have enough valid number of combination
           result.add(current);
           return;
       }
       
       String letters=mapping[digits.charAt(index)-'0'];// converts our number as a string into a integer.
       for(int i=0; i<letters.length();i++){
           
           letterCombRecursv(result,digits,current+letters.charAt(i),index+1,mapping);
       }
       
       
   }
}
