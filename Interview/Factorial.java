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
public class Factorial {

public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number whose factorial you want: ");
    
    int n = sc.nextInt();
    int f = 1;
    for (int i= n;i>0;i--){
        f=f*i;
    }
    
    System.out.println("Factorial of "+n+ " is "+f);
}    
}



























