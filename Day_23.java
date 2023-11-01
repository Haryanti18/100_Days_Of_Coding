package Coding;

import java.util.Scanner;

public class day_23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode kendaraan: ");
        int kodeKendaraan = scanner.nextInt();
        String jenisKendaraan;

        switch (kodeKendaraan) {
            case 1:
                jenisKendaraan = "Mobil";
                break;
            case 2:
                jenisKendaraan = "Motor";
                break;
            case 3:
                jenisKendaraan = "Bus";
                break;
            case 4:
                jenisKendaraan = "Truk";
                break;
            default:
                jenisKendaraan = "Kendaraan Tidak Dikenal";
                break;
        }

        System.out.println("Jenis kendaraan: " + jenisKendaraan);
    }
}
