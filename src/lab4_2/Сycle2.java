package lab4_2;

public class Сycle2 {
    public static void main(String[] args) {
        for (int i = 1; i < 99; i++) {
            if (i % 3 == 0) {
                System.out.printf("Делиться на 3: %d\n", i);
            }
            if (i % 5 == 0) {
                System.out.printf("Делиться на 5: %d\n", i);
            }

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("Делиться на и 5 на и 3: %d\n", i);
            }
        }

    }
}
