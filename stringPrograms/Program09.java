
// sum of the numbers in a string
package stringPrograms;


public class Program09 {
    
    static int sumNum(String str)
    {
        int sum=0;
        String temp="0";
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                temp=temp+ch;
            }
            else
            {
                sum=sum+Integer.parseInt(temp);
                temp="0";
            }
        }
        
        return sum+Integer.parseInt(temp);  // here this code is written if the digit are at the last of the string so to add those number we have to add here
    }
    
    
    
    public static void main(String args[])
    {
        String str="1bc268";
        
        System.out.println("sum of the numbers in the strring is "+ sumNum(str));
    }
    
}
