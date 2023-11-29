package Coding;

import java.util.Scanner;

public class day_52 {

    public static void main(String[] args) {

        int nilai;
        String kategori;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        nilai = input.nextInt();

        if (nilai >= 90) {
            kategori = "A";
        } else if (nilai >= 80) {
            kategori = "B";
        } else if (nilai >= 70) {
            kategori = "C";
        } else if (nilai >= 60) {
            kategori = "D";
        } else {
            kategori = "E";
        }

        System.out.println("Kategori nilai: " + kategori);
    }
}

