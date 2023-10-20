package Coding;

import java.util.Scanner;

public class day_10 {

    public static void main(String[] args) {
        // deklarasi variabel
        String nama;
        int umur;
        String tempatKuliah;

        // membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // input nama
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        // input umur
        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        // input tempat kuliah
        System.out.print("Masukkan tempat kuliah: ");
        tempatKuliah = input.nextLine();

        // menampilkan data yang diinputkan
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tempat kuliah: " + tempatKuliah);
    }
}


