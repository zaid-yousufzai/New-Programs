/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Check if a number is Armstrong Number or not




package numbersPrograms;

/**
 *
 * @author Hp
 */

import java.util.Scanner;
public class Armstrong {
    
    static boolean isArmstrong(int n)
    {
        int temp=n;
        int power=0;
        while(temp>0)
        {
            temp=temp/10;
            power++;
        }
        int dummy=n;
        double sum=0;
        while(dummy>0)
        {
            int r=dummy%10;
            sum=sum+Math.pow(r,power);
            dummy=dummy/10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        if(isArmstrong(n))
        {
            System.out.println("Armstrong number");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
