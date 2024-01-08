
//wap to find the string is palindrome or not

package stringPrograms;



import java.util.Scanner;
public class Program01 {
    
    static void isPalindrome(String str,int start,int end)
    {
        int count=0;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                count++;
            }
            start++;
            end--;
        }
        if(count>0)
        {
            System.out.println("Not a palindrome ");
        }
        else{
            System.out.println("palindrome");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str=sc.nextLine();
        isPalindrome(str,0,str.length()-1);
    }
    
    
}
