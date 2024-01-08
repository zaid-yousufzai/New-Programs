/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//find the factorial
package numbersPrograms;

/**
 *
 * @author Hp
 */
 
 import java.util.Scanner;
public class Factorial {
    
    static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
       System.out.println(fact(n));
    }
    
}
