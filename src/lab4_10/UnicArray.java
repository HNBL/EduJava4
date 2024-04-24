package lab4_10;

public class UnicArray {

    //static void uniqSearch(int[] a) {
    //   for (int i = 0; i < a.length; ) {
    //  for (int j = i + 1; j < a.length; ++j) {
    //    if (a[i] == a[j]) {
    //        i++;
    //        break;
    //     }
    // }
    // }
    // }

//    int[] arr = new int[]{1, 2, 4, 7, 4, 2, 1};
    //  uniqSearch(arr);


    public static void main(String[] args) {
        int[] myArray = {7, 1, 7, 8, 1, 67, 6, 5, 6};
        for (int i = 0; i < myArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == myArray[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(myArray[i] + " ");
        }
    }

}
