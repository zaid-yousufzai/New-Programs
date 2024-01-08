/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Check if a number is prime or not

package numbersPrograms;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class PrimeNumber {
    
    static boolean isPrime(int x)
    {
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
                return false;
            
        }
        return true;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        boolean ans = isPrime(n);
        if(n!=1 && ans==true)
            System.out.println("Prime number");
        else
            System.out.println("not prime");
    }
}
