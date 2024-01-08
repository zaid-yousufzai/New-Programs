

//Remove all vowels from the string
package stringPrograms;

/**
 *
 * @author Hp
 */
public class Program04 {
    
    static String removeVowels(String str)
    {
        String noVowel="";
        str.toLowerCase();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            {
                continue;
            }
            else
            {
                noVowel=noVowel+str.charAt(i);
            }
        }
        
        
        return noVowel;
        
    }
    
    
    public static void main(String args[])
            
            
    {
        String str="My name is zaid khan";
        System.out.println("String after removing vowels "+ removeVowels(str));
    }
    
}
