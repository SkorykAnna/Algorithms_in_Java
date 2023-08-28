import java.util.Scanner;


//Sorting - positive and negative
//In the first line, the number H, the number of elements of the array, is entered. 
//In the second line, through a space, the elements of the array are written to the number.
// The output is a sorted array in which all negative elements are in non-decreasing order, 
//and all positive elements are in non-increasing order.


public class lab2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0, k = 0;
        int[] array = new int[n];
        int[] arrayPositive = new int[n];
        int[] arrayNegative = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] <= 0) {
                arrayNegative[j] = array[i];
                j++;
            } else {
                arrayPositive[k] = array[i];
                k++;
            }
        }
        sort(arrayPositive, k);
        sort(arrayNegative, j);
        for (int i = 0; i < j; i++) {
            System.out.print(arrayNegative[i] + " ");
        }
        for (int i = k - 1; i >= 0; i--) {
            System.out.print(arrayPositive[i] + " ");
        }
    }
    private static void sort(int[] array, int n) {
        int temp;
        for (int h = 0; h < n - 1; h++) {
            for (int p = 0; p < n - h - 1; p++) {
                if (array[p] > array[p + 1]) {
                    temp = array[p];
                    array[p] = array[p + 1];
                    array[p + 1] = temp;
                }
            }
        }
    }
}

