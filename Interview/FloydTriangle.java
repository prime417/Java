/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

/**
 *
 * @author Pankaj
 */
public class FloydTriangle {
    public static void star(int n){
        
        for(int i = 1 ; i<n;i++){
            
          for(int q = n;q>i;q--){
    System.out.print("$");
}
            for(int j=1;j<=i;j++){
                  System.out.print("*");
                
            }
//            System.out.println(" ");

System.out.println(" ");
        }
    }
    
    public static void main(String [] args){
        star(4);
    }
}
