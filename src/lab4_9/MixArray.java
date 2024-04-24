package lab4_9;

import java.util.Arrays;
import java.util.Scanner;


public class MixArray {
    int[] arr;

    public static int[] initLong() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int g = scanner.nextInt();
        int[] arr = new int[g];
        System.out.println("Enter numbers of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(arr));
        return arr;
    }

    static void changeArray(int[] a) {

        int x = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = x;

        System.out.println("Result: " + Arrays.toString(a));
    }


    public static void main(String[] args) {

        changeArray(initLong());
    }
}



