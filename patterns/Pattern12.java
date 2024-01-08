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
public class Pattern12 {
    
    static void printPattern(int n)
    {
        int sum;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                sum=i+j;
                if(sum%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows ");
        int n=sc.nextInt();
        printPattern(n);
    }
    
}
