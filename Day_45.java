package Coding;

import java.util.Scanner;

public class day_45 {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        String abjad;
        int nilai;

        // Input abjad
        System.out.print("Masukkan abjad nilai: ");
        abjad = input.next();

        // Konversi abjad menjadi nilai
        switch (abjad) {
            case "A":
                nilai = 90;
                break;
            case "B":
                nilai = 80;
                break;
            case "C":
                nilai = 70;
                break;
            case "D":
                nilai = 60;
                break;
            case "E":
                nilai = 50;
                break;
            default:
                System.out.println("Nilai tidak valid");
                return;
        }

        // Tampilkan nilai
        System.out.println("Nilai: " + nilai);
    }
}
