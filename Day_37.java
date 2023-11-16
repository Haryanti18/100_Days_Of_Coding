package Coding;

import java.util.Scanner;

public class day_37 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        System.out.print("Masukkan angka ketiga: ");
        int angka3 = scanner.nextInt();

        int jumlah = angka1 + angka2 + angka3;

        if (jumlah % 2 == 1) {
            jumlah += 1;
        } else {
            jumlah += 2;
        }

        System.out.println("Hasil penjumlahan: " + jumlah);
    }
}
