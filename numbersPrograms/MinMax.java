/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Maximum and Minimum Digit in a Number

package numbersPrograms;

/**
 *
 * @author Hp
 */

import java.util.*;
public class MinMax {
    
    static void printMinMax(int x)
    {
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        while(x>0)
        {
            int r=x%10;
            mini=Math.min(mini, r);
            maxi=Math.max(maxi, r);
            x=x/10;
        }
        System.out.println("minimum digit is "+mini);
        System.out.println("maximum digit is "+maxi);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        printMinMax(n);
    }
}
