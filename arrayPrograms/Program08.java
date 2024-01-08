

// wap to remove the even numbers from the array

package arrayPrograms;



import java.util.Scanner;
public class Program08 {
    
    static void printArray(int ar[])
    {
        System.out.println("Array is ");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    
    static void removeEven(int ar[])
    {
        int oddCount=0;
        for(int i=0 ;i < ar.length; i++)
        {
            if(ar[i]%2 !=0)
            {
                oddCount++;
            }
        }
        
        int b[]=new int[oddCount];
        int idx=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]%2 != 0)
            {
                b[idx]=ar[i];
                idx++;
            }
        }
        System.out.println("Odd aray is ");
        printArray(b);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the array elements ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("Original array ");
        printArray(a);
        removeEven(a);
        
        
    }
    
}
