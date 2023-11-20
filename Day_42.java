package Coding;

import java.util.Scanner;

public class day_42 {

    public static void main(String[] args) {

        Scanner an = new Scanner(System.in);
        System.out.println("Masukkan angka : ");
        int angka = an.nextInt();
        for (int i = angka ; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }

}
