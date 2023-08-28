import java.util.Scanner;

// The input is one number N. The output is the first N prime numbers.

public class lab1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, c;
        int count = 0;
        if (n <= 0) System.out.println(" ");
        for (int j = 2; count <= n - 1; j++) {
            c = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    c++;
                }
            }
            if (c == 2){
                count++;
                System.out.print(j + "  ");
            }
        }
    }
}
