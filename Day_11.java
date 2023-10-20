package Coding;

import java.util.Scanner;

public class day_11 {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        // Hitung penjumlahan
        System.out.print("Masukkan bilangan pertama: ");
        a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        b = sc.nextInt();

        // Hitung hasil kali
        int Hasil_Kali = a * b;

        // Hitung hasil bagi
        int Hasil_Bagi = a / b;

        // Tampilkan hasil
        System.out.println("Hasil kali: " + Hasil_Kali);
        System.out.println("Hasil bagi: " + Hasil_Bagi);
    }
}

