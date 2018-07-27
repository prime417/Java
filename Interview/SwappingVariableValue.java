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
 class SwappingVariableValue {

      public static void main(String [] args){
          System.out.println("Enter first value");
          Scanner sc = new Scanner(System.in);
          
          int a = sc.nextInt();
          
          System.out.println("Enter second value");
          
          int b = sc.nextInt();
          
          a = a+b;
          b= a-b;
          a= a-b;
          
          System.out.println("After swapping first value is "+a+ "second value is "+b);
      }
    

}
