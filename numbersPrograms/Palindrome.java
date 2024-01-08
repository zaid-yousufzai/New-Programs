//Check if a number is palindrome or not

package numbersPrograms;

/**
 *
 * @author Hp
 */
import java.util.Scanner;
public class Palindrome {
    
    int reverse(int x)
    {
         int p=0;
        while(x>0)
        {
       
        int r=x%10;
        p=p*10+r;
        x=x/10;
        }
        return p;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=sc.nextInt();
        int temp=n;
        Palindrome obj = new Palindrome();
        int y=obj.reverse(n);
        if(y==temp)
        {
            System.out.println("Palindrome");
        }
        
        else{
            System.out.println("Not Palindrome");
        }
    }
}
