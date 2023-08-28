import java.util.Scanner;

//Even and odd sorting
//The number H is given for input in the first line - the number of elements of the array. 
//In the second line, H numbers are written through a space - elements of the array. 
//All even elements are output first in non-decreasing order, and then all odd elements 
//in non-increasing order.


public class lab2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = 0, k =0;
        int[] array = new int[n];
        int[] arrayEven = new int[n];
        int[] arrayOdd = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(array[i] % 2 != 0)
            {
                arrayOdd[j] = array[i];
                j++;
            }
            else
            {
                arrayEven[k] = array[i];
                k++;
            }
        }
        sort(arrayEven, k);
        sort(arrayOdd, j);
        for (int i = 0; i < k; i++) {
            System.out.print(arrayEven[i] + " ");
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arrayOdd[i] + " ");
        }
    }
    private static void sort (int [] array, int n) {
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
