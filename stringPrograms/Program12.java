package stringPrograms;
import java.util.HashSet;
//panagram string contains all alphabets from a-z
public class Program12 {

    static boolean isPanagram(String str)
    {
        HashSet<Character> hs=new HashSet<>();
        for(char ch='a';ch<='z';ch++)
        {
            hs.add(ch);
        }

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            hs.remove(ch);
    
                if(hs.isEmpty())
                {
                    return true;
                }
            
        }

        return false;
    }


    public static void main(String args[])
    {
String s1="abcdefghijklmnopqrstuvwxyz  ihnhfrnhxlhrzmqewg  mulzewhfzf";
String s2=" hbdngwye zmbdezwlkhurfi iyegzm  evekjvcf";

System.out.println("S1 is "+isPanagram(s1.toLowerCase()));
System.out.println("S2 is "+isPanagram(s2.toLowerCase()));
    }
    
}
