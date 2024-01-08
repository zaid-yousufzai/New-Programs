
package stringPrograms;

// remove characters from the string except alphabets
public class Program06 {
    
    
    static String removeChar(String str)
    {
        String noChar="";
        
        for(int i=0;i<str.length();i++)
        {
            int ascii=str.charAt(i);
            if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122) || str.charAt(i)== ' ' )
            {
                 noChar=noChar+str.charAt(i);
                
            }
            else
            {
                continue;
            }
        }
        
        return noChar;
    }
    
    
    
    public static void main(String args[])
    {
        String str=" My n@me i$ z@!d & 7k8han ";
        System.out.println("String after removing special character"+removeChar(str));
    }
    
}
