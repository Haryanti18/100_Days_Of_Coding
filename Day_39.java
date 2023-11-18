package Coding;

import java.util.Scanner;

public class day_39 {

    public static void main(String[] args) {
        int batasAtas = 0;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas atas : ");
        batasAtas = input.nextInt();

        for (int i = 1; i <= batasAtas; i++) {
            if (i % 2 == 1) {
                System.out.println("angka ganji " + i);
                total += 1;
            }
        }
        System.out.println("angka ganjil muncul sebenyak : " + total);
    }
}