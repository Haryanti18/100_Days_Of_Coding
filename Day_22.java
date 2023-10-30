package Coding;

public class day_22 {
    public static void main(String[] args) {
         int nilai = 85;

        switch (nilai) {
            case 90:
            case 85:
            case 80:
                System.out.println("Nilai anda A, B, atau C.");
                break;
            case 75:
            case 70:
                System.out.println("Nilai anda D atau E.");
                break;
            default:
                System.out.println("Nilai anda tidak valid.");
        }
    }
}
