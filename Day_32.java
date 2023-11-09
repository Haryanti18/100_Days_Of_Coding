package Coding;

import java.util.Scanner;

public class day_32 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Mencetak angka dari 1 hingga 100
            for (int i = 1; i <= 100; i++) {
                System.out.println(i);
            }

            // Memasukkan inputan angka
            System.out.print("Masukkan angka: ");
            int input = scanner.nextInt();

            // Mencetak angka ditemukan jika inputan sama dengan 50
            if (input == 50) {
                System.out.println("Angka ditemukan");
                return;
            }
        }
    }