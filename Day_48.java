package Coding;

import java.util.Scanner;

public class day_48 {
   public static void main(String[] args) {

        // Deklarasi variabel
        String nama, nim, agama;
        double tinggiBadan;
        char ukuranBaju;
        boolean statusPernikahan;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan nim: ");
        nim = input.nextLine();
        System.out.print("Masukkan tinggi badan (dalam Kg): ");
        tinggiBadan = input.nextDouble();
        System.out.print("Masukkan ukuran baju (S, M, L, XL, XXL): ");
        ukuranBaju = input.next().charAt(0);
        System.out.print("Masukkan status pernikahan (true/false): ");
        statusPernikahan = input.nextBoolean();
        System.out.print("Masukkan agama: ");
        agama = input.nextLine();

        // Tampilkan data
        System.out.println("Data diri mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Tinggi badan: " + tinggiBadan + " Kg");
        System.out.println("Ukuran baju: " + ukuranBaju);
        System.out.println("Status pernikahan: " + (statusPernikahan ? "Menikah" : "Belum menikah"));
        System.out.println("Agama: " + agama);
    }
}
