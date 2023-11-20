package Coding;

import java.util.Scanner;

public class day_43 {

    public static void main(String[] args) {
        Scanner an = new Scanner(System.in);

        System.out.println("Masukkan nilai : ");
        int nilai = an.nextInt();
        for (int i = nilai; i < 10; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }
    }
}
