

package stringPrograms;

// capitalize first and last character of each word
public class Program10 {
    
    static String toCapital(String str)
    {
        str=" "+str+" ";
        String result="";
        char ch;
        
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                
               result=result+ch;
               i++;
               ch=str.charAt(i);
               result=result+Character.toUpperCase(ch);
            }
            
        }
        
        
        
        return result;
    }
    
    
    public static void main(String args[])
    {
        String str="my name is zaid khan";
        System.out.println("String after modification "+toCapital(str));
    }
}
