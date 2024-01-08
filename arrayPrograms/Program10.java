
//move zeros to the end of the array
package arrayPrograms;


public class Program10 {
    
    static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    
    static void moveZero(int a[])
    {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0 && a[j]==0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            if(a[j]!=0)
            {
                j++;
            }
        }
        System.out.println("new array is ");
        printArray(a);
    }
    public static void main(String args[])
    {
        
        int a[]={1,7,0,5,0,8,2,0,6,7,0};
        
        System.out.println("original array");
        printArray(a);
        moveZero(a);
    }
    
}
