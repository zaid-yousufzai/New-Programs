

// reverse any array 
package arrayPrograms;

/**
 *
 * @author Hp
 */

public class Program03 {
    
    static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    static void reverseArray(int a[],int start,int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("reverse array is ");
        printArray(a);
    }
    
    public static void main(String args[])
    {
        
        int a[]={1,2,3,4,5,6,7,8,9};
        
       
        System.out.println("Original array is ");
        printArray(a);
        reverseArray(a,0,a.length-1);
    }
    
}
