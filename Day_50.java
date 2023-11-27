package Coding;

import java.util.Scanner;

public class day_50 {

    public static void main(String[] args) {

        int batas;
        int i;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas: ");
        batas = input.nextInt();

        if (batas % 2 == 0) {

            for (i = 2; i <= batas; i += 2) {
                System.out.print(i + " ");
            }
        } else {

            for (i = 1; i <= batas; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
