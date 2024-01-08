/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Prime numbers in a given range


package numbersPrograms;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class PrimeSeries {
    
    static boolean isPrime(int x)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            {
                count++;
            }
            
        }
        if(count==0)
        return true;
        else
            return false;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first index");
        int first=sc.nextInt();
        System.out.println("Enter the last index");
        int last=sc.nextInt();
        for(int i=first;i<=last;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    
}
