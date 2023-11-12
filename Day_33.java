package Coding;

import java.util.Scanner;

public class day_33 {

    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = angka.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = angka.nextInt();

        // Cek apakah angka pertama genap
        boolean angkaPertamaGenap = angkaPertama % 2 == 0;

        // Cek apakah angka kedua genap
        boolean angkaKeduaGenap = angkaKedua % 2 == 0;

        // Tambahkan 1 ke angka pertama jika genap
        if (angkaPertamaGenap) {
            angkaPertama = angkaPertama + 1;
        } // Tambahkan 2 ke angka pertama jika ganjil
        else {
            angkaPertama = angkaPertama + 2;
        }

        // Tambahkan 1 ke angka kedua jika genap
        if (angkaKeduaGenap) {
            angkaKedua = angkaKedua + 1;
        } // Tambahkan 2 ke angka kedua jika ganjil
        else {
            angkaKedua = angkaKedua + 2;
        }

        // Cetak hasil
        System.out.println("Hasil:");
        System.out.println("Angka pertama: " + angkaPertama);
        System.out.println("Angka kedua: " + angkaKedua);
    }

}
