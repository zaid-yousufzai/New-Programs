

//find frequency of each elements in an array

package arrayPrograms;


import java.util.HashMap;
import java.util.Map;

public class Program04 {
    
    static void frequencyElement(int a[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        
       // System.out.println(map);

        
        
    }
    
    
    public static void main(String args[])
    {
        
        int a[]={1, 2, 3, 4, 1, 2, 2, 3, 5, 4, 1};
       
        frequencyElement(a);
    }
    
    
}
