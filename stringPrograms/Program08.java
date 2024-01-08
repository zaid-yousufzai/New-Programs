

 //remove brackets from string

package stringPrograms;


public class Program08 {
    
    static String removeBracket(String s)
    {
        String noBracket="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                continue;
            }
            else
            {
                noBracket=noBracket+s.charAt(i);
            }
        }
        
        
        
        
        
        return noBracket;
    }
    
    public static void main(String args[])
    {
        String str="“(((a-b))+c)”";
        System.out.println("String after removing brackets "+removeBracket(str));
    }
    
}
