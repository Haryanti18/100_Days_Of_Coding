package Coding;

public class day_17 {
     public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Perbandingan sama dengan
        boolean samaDengan = (a == b);
        System.out.println("a == b: " + samaDengan);

        // Perbandingan tidak sama dengan
        boolean tidakSamaDengan = (a != b);
        System.out.println("a != b: " + tidakSamaDengan);

        // Perbandingan lebih besar dari
        boolean lebihBesarDari = (a > b);
        System.out.println("a > b: " + lebihBesarDari);

        // Perbandingan lebih kecil dari
        boolean lebihKecilDari = (a < b);
        System.out.println("a < b: " + lebihKecilDari);

        // Perbandingan lebih besar atau sama dengan
        boolean lebihBesarSamaDengan = (a >= b);
        System.out.println("a >= b: " + lebihBesarSamaDengan);

        // Perbandingan lebih kecil atau sama dengan
        boolean lebihKecilSamaDengan = (a <= b);
        System.out.println("a <= b: " + lebihKecilSamaDengan);
    }
}
