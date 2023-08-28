import java.util.Scanner;

//Bubble sorting
//In the input, the first line contains the number H - the number of elements in the array. 
//In the second line - the array itself. It is guaranteed that all elements of the array are different 
//and do not exceed modulo 10^9.
//At the output, one number is the number of bubble sort exchanges.

public class lab2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 1000) System.out.print("");
        int[] array = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int h = 0; h < n - 1; h++) {
            for (int j = 0; j < n - h - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

