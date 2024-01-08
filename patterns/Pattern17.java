/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Pattern17 {
    
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<(2*i);k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
            
        }
        
        
         for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<(2*i);k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
    }
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int n=sc.nextInt();
        printPattern(n);
        
    }
    
}
