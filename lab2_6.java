import java.util.Scanner;

//Sorting modules
//In the first line of the input data, the number H is given for input - the number 
//of elements of the array. In the second, H numbers are written through a space - 
//the elements of the array. All elements of the array are given in the output in 
//the order of non-decreasing moduli of the elements. In the case of equality of modules, 
//a negative number is output first, and then a positive number.

public class lab2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int h = 0; h < n - 1; h++) {
            for (int j = 0; j < n - h - 1; j++) {
                if (Math.abs(array[j]) > Math.abs(array[j + 1]) &
                        Math.abs(array[j]) != Math.abs(array[j + 1])) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                if (Math.abs(array[j]) == Math.abs(array[j + 1])) {
                    if (array[j] < array[j + 1]) {
                        temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j ] = temp;
                    }
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }

            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

