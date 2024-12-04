import java.util.Scanner;

public class test {

    static int powNum(int n) {

        int res = 0;
        while (n > 0) {
            n = n / 10;
            res++;
        }

        return res;
    }

    static void isArmstrong(int n) {
        int p = powNum(n);
        int temp = n;
        int arm = 0;

        while (temp > 0) {

            int r = temp % 10;

            temp = temp / 10;
            arm += Math.pow(r, p);
        }

        if (arm == n) {
            System.out.println("Arms torn number s arm= " + arm + " n= " + n);
        }

        else {
            System.out.println("not the armstrogn number");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        isArmstrong(n);

    }

}
