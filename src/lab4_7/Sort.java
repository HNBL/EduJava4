package lab4_7;

public class Sort {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 4, 5, 9, 7, 8};

        arraySortedCheck(arr);
    }


    private static void arraySortedCheck(int[] arr) {
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please try again");
        }
    }

}
