

//count vowel consonant and the spaces 
package stringPrograms;


public class Program02 {
    
    static void count(String str)
    {
        int vowel=0,consonant=0,spaces=0;
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
            }
            else if(ch==' ')
            {
                spaces++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("number of vowel is "+vowel);
        System.out.println("number of spaces is "+spaces);
        System.out.println("number of consonant is "+consonant);
    }
    
    public static void main(String args[])
    {
        String str="my name is zaid khan";
        count(str);
    }
}
