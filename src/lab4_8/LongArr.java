package lab4_8;
import java.util.Arrays;
import java.util.Scanner;


    public class LongArr {


        public static void initLong() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter array length: ");
            int g = scanner.nextInt();
            int[] arr = new int[g];
            System.out.println("Enter numbers of array:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Result: " + Arrays.toString(arr));
        }

        public static void main(String[] args) {
            initLong();
        }

    }


