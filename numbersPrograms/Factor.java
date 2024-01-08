/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//find the factor 

package numbersPrograms;

/**
 *
 * @author Hp
 */

import java.util.Scanner;
public class Factor {
    
    static void fact(int n)
    {
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        fact(n);
    }
    
}
