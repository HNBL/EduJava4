package lab4_5;

public class CycleArray {

    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 10, 5, 8, 3, 3};

        System.out.print("Array =");
        for (int v : arr)
            System.out.printf("%d ",v);


        if (arr[0] == 3 && arr[6] == 3) {
            System.out.println(arr[0] == 3 && arr[6] == 3);

        }
        else
            System.out.println(arr[0] == 3 && arr[6] == 3);

    }
}


