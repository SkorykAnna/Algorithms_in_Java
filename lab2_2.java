import java.util.Scanner;

//Sorting by the method of direct selection
//In the input, the first line contains the number H - the number of elements of the array. 
//The second line contains the array itself, a sequence of natural numbers. 
//The output shows the state of the given array after each insertion iteration. 
//If the array is already sorted, the corresponding output will be displayed.

public class lab2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        if(insertionSort(array, n)) {
            System.out.println("The array is already sorted");
        }
    }
    private static boolean insertionSort(int[] array, int n) {
        boolean sort = true;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
            if (key != array[i]) {
                for (int h = 0; h < n; h++) {
                    System.out.print(array[h] + " ");
                }
                System.out.print("\n");
                sort = false;
            }
        }
        return sort;
    }
}
