package Coding;

import java.util.Scanner;

public class day_49 {
     public static void main(String[] args) {

       
        int batas;
        int i;

       
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas: ");
        batas = input.nextInt();


        for (i = 1; i <= batas; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

 
        if (batas <= 2) {
            System.out.println("(Kosong)");
        }
    }
}
