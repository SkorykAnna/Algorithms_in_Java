 import java.util.Scanner;

 //The minimum method
//The number H is given for input in the first line - the number of elements of the array. 
//The array itself is in the second line. It is guaranteed that all elements of the array 
//are different and do not exceed modulo 10^9.
//One number is given for the output - the number of moves of the first element.


public class lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1 || n > 1000) {
            System.exit(0);
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(selectionSort(array, n));
    }
    private static int selectionSort(int[] array, int n) {
        int pos;
        int temp;
        int count = 0;
        int first = array[0];
        for (int i = 0; i < n; i++) {
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[pos]) {
                    pos = j;
                }
            }
            temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;
            if (((first == array[pos]) || (first == array[i])) && (array[pos] != array[i])) {
                count++;
            }
        }
        return count;
    }
}

