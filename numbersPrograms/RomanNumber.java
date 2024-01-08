package numbersPrograms;
import java.util.Scanner;
public class RomanNumber {

    static int toRoman(String str)
    {
        int value,result=0,prevalue=0;
        char ch;
        for(int i=str.length()-1;i>=0;i--)
        {
            ch=str.charAt(i);
            value=romanValue(ch);
            if(value==-1)
            {
                return -1;
            }
            if(value<prevalue)
            {
                result-=value;
            }
            else{
                result+=value;
            }
            prevalue=value;
            
        }
        return result;
    }

    static int romanValue(char c)
    {
        switch (c) {
            case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
            default:return -1;
                
        }
    }

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the roman number");
        String roman =sc.nextLine().toUpperCase();
        int num=toRoman(roman);
        System.out.println("roman number value is "+num);

    }
    
}
