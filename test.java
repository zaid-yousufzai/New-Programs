import java.util.Scanner;

public class test {

    static int countFactorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int f=countFactorial(n);
        System.out.println("Factorial of "+n+" is "+f);
    }
}