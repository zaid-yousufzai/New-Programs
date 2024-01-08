
//wap to remove all spaces from a string

package stringPrograms;

/**
 *
 * @author Hp
 */
public class Program05 {
    
    static String removeSpaces(String str)
    {
//       String noSpace= str.replace(" ","");
//        return noSpace;
        
        String noSpace="";
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                noSpace=noSpace+str.charAt(i);
            }
        }
        
        
        return noSpace;
    }
    
    
    public static void main(String args[])
    {
        String str="     My name is zaid    ";
        System.out.println("String after removing spaces "+removeSpaces(str));    
    }
    
}
