package stringPrograms;

import java.util.HashMap;

//count the characters except spaces
public class Program11 {

    static void count(String str)
    {
        HashMap<Character,Integer> hs=new HashMap<>();
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);

            if(ch!=' ')
            {

            
            if(hs.containsKey(ch))
            {
hs.put(ch,hs.get(ch)+1);
            }
            else{
                hs.put(ch,1);
            }
        }
        }

        System.out.println(hs);
    }


    public static void main(String args[])
    {
        String str="My name is zaid";
        count(str);
    }
    
}
