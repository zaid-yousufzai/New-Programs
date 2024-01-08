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
public class Pattern15 {
    
    
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            
            for(int k=i;k>=1;k--)
            {
                System.out.print(k);
            }
            for(int q=2;q<=i;q++)
            {
                System.out.print(q);
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
