import java.util.Scanner;

//The program receives as input a sequence of integers, each number is written in a separate line. 
//The sequence ends with number 0, upon reading which the program must finish its work. 
//The numbers following the number 0 should not be read. As an output, 
//you get the number of prime numbers in the given sequence.

public class lab1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10000; i++) {
            int n = sc.nextInt();
            if (n == 0) break;
            if (isPrime(n)) count++;
        }
        System.out.print(count);
    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
