/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author Pankaj
 */
public class StarPattern1 {
    
    public static void pattern1(int n){
      
        for(int i = 1 ;i<=n;i++){
            
            for(int j =5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
        
    }
    
    public static void pattern2(int n){
      
        for(int i = 1 ;i<=n;i++){
            
            for(int j =4;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String [] args){
        pattern1(4);
//        pattern2(4);
    }
}
