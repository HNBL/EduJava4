package lab4_6;

public class CycleArray2 {


    public static void main(String[] args) {

        int x = 10;
        int[] arr = new int[x];


        for (int i = 0; i < x; i++) {

            if (arr[i] == 1 | arr[i] == 3) {
                System.out.printf("Массив содержит 3 или 1");

            }


        }
    }

}
