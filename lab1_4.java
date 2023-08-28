import java.util.Scanner;

// Two numbers A and B, which are not equal to zero at the same time, are written to the data input. 
//The greatest common divisor is given for the output.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.print((comDe(n,p) < 0) ? -comDe(n,p) : comDe(n,p));
    }
    public static int comDe(int n, int p) {
        if (p==0)
            return n;
        else
            return comDe(p, n % p);
    }
}

