package Coding;

import java.util.Scanner;

public class day_51 {

    public static void main(String[] args) {

        double km;
        int cm;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak dalam km: ");
        km = input.nextDouble();

        cm = (int) (km * 100000);

        System.out.println("Jarak dalam cm: " + cm);
    }
}
