

//wap to shuffle an array

package arrayPrograms;

import java.util.Random;

public class Program09 {


    static void print(int a[])
    {
for(int i:a)
{
    System.out.print(i+" ");
}
    }

    static void shuffleArray(int a[])
    {
        int n=a.length;
        int random,temp;
        Random r =new Random();

        for(int i=0;i<n;i++)
        {
            random=r.nextInt(n-i);
temp=a[i];
a[i]=a[random];
a[random]=temp;

        }
    }


    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6};
        shuffleArray(a);
        print(a);

    }
    
}
