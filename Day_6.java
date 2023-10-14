package Coding;

import java.util.Scanner;

public class day_6 {

    public static void main(String[] args) {
        // Deklarasi variabel
        String nama;
        int umur;
        int jumlahKeluarga;
        String tempatKuliah;

        // Input data
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan umur: ");
        umur = input.nextInt();
        System.out.print("Masukkan jumlah keluarga: ");
        jumlahKeluarga = input.nextInt();
        System.out.print("Masukkan tempat kuliah: ");
        tempatKuliah = input.nextLine();

        // Tampilkan data
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jumlah keluarga: " + jumlahKeluarga);
        System.out.println("Tempat kuliah: " + tempatKuliah);
    }
}
