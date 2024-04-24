package lab4_4;

import java.util.Scanner;

public class Cycle4 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();


        Scanner ib = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        int b = ib.nextInt();

        Scanner id = new Scanner(System.in);
        System.out.print("Введите третье число: ");
        int c = id.nextInt();

        if(a<b&b<c ){
            System.out.print("результат: ");

            System.out.println((a<b)&(b<c));

        }
        else
        {
            System.out.print("результат: ");
            System.out.println((a<b)&(b<c));
        }

    }
}
