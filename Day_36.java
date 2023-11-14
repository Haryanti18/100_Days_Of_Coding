package Coding;

import java.util.Scanner;

public class day_36 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka % 2 == 1) {
            // mencetak angka ganjil
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 1) {
                    System.out.print(i + " ");
                }
            }
        } else {
            // mencetak angka genap
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
