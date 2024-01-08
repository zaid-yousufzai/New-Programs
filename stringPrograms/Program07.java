
// reverse a string
package stringPrograms;


public class Program07 {
    
    static void reverse(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    
    public static void main(String args[])
    {
        String str="Zaid Khan";
        reverse(str);
    }
    
}
