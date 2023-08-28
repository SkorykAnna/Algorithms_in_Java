import java.util.Scanner;

//Three integers A, B, C are written to the data input and they are not equal to zero at the same time. 
//The greatest common divisor is given for the output.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int f = sc.nextInt();
        int max = (comDe(n,comDe(p,f)));
        System.out.print((max < 0) ? -max : max);
    }
    public static int comDe(int n, int p) {
        if (p==0)
            return n;
        else
            return comDe(p, n % p);
    }
}
