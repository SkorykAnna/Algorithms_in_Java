import java.util.Scanner;

// Two natural numbers A and B are written to the data input. 
// All prime numbers from the specified range are output.

public class lab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int i, c;
        if (n >= p && n <= 0) System.out.println(" ");
        for (int j = n; j <= p; j++) {
            c = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    c++;
                }
            }
            if (c == 2){
                System.out.print(j + "  ");
            }
        }
    }
}

