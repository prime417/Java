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
class ReverseString
{
    public static void main(String[] args)
    {
        String input = "Geeks For Geeks";
 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray(); // try1 = ['G','e','e','k','s',' ','F','o','r',' ','G','e','e','k','s'];
 
        for (int i = try1.length-1; i>=0; i--){
            System.out.print(try1[i]);
    }
    }
}