package Coding;

public class day_28 {

    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean prima = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.println(i);
            }
        }
    }
}
