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
public class Pattern1 {
    
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    
    
    public static void main(String args[])
    {
        
        System.out.println("enter the number of rows ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPattern(n);
    }
}
