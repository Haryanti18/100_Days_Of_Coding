package Coding;

import java.util.Scanner;

public class day_9 {

    public static void main(String[] args) {
        // membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel untuk menyimpan input pengguna
        int a, b;

        // memasukkan inputan atau angka yang diinginkan
        System.out.print("Masukkan bilangan pertama: ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = input.nextInt();

        // Hitung penjumlahan
        int c = a - b;

        // Tampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan: " + c);
    }
}
