/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

import java.util.Scanner;

/**
 *
 * @author Pankaj
 */
public class PalindromeString {
    
    public static void main(String [] args){
        
        System.out.println("Enter a Sentence");
        Scanner sc = new Scanner(System.in);
        String inputString = "pspaaaa";
        String revString = "";
//        char [] myArray = inputString.toCharArray();
        
//        for (int i = inputString.length()-1;i>=0;i--){
//            
//        revString = revString + inputString.charAt(i)+"";
////            System.out.print(revString);
//        }
        revString = inputString.replace("aaaa" ,"");
        
        
         System.out.println(revString);
         
         
         
        if(!inputString.equals(revString)){
            System.out.println("not a Palindrome String");
        }
        else{
            System.out.println("Palindrome String");
        }
        
    }
    
}
