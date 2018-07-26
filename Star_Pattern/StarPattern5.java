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
public class StarPattern5 {
    
    public static void pattern1(int n){
        
       for(int i=1;i<= n ; i++){
            
            for(int k = 5;k>=i;k--){
                
                System.out.print(" ");
            }
            for(int j = 1;j<(i*2);j++){
               
                if (j>1 && j<((i*2)-1)) {
                    
                  System.out.print(" "); 
                }
                else{
                   System.out.print("*"); 
                }
                
            }
            
            System.out.println(" ");
        }
    }
    
    public static void pattern2(int n ){
        
        for(int i=5;i>=1 ; i--){
            
            for(int k = 5;k>i;k--){
                
                System.out.print(" ");
            }
            for(int j = 1;j<(i*2);j++){
               
                {
                    if(j>1 && j< (i*2)-1){
                      System.out.print(" ");   
                    }else{
                        System.out.print("* "); 
                    }
                  
                }
                
            }
            
            System.out.println(" ");
        }
    }
    
    public static void main(String [] args){
        
    // pattern1(4);
       pattern2(4);
    }
}
