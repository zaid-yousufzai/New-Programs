/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Find all Palindrome numbers in a given range

package numbersPrograms;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class PalindromeSeries {
    
     boolean isPalindrome(int n)
    {
        int temp=n;
        int p=0;
        while(temp>0)
        {
            int r=temp%10;
            p=p*10+r;
            temp=temp/10;
        }
        if(p==n)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the initial number ");
        int initial=sc.nextInt();
        System.out.println("Enter the last number ");
        int last=sc.nextInt();
        PalindromeSeries obj=new PalindromeSeries();
        for(int i=initial;i<=last;i++)
        {
            if(obj.isPalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
        
    }
}
