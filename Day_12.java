package Coding;

public class day_12 {

    public static void main(String[] args) {
        // Deklarasi variabel
        String stringInt = "123";
        String stringFloat = "123.456";
        String stringBoolean = "true";
        String stringChar = "A";

        // Konversi string ke tipe data primitif
        int intVal = Integer.parseInt(stringInt);
        float floatVal = Float.parseFloat(stringFloat);
        boolean booleanVal = Boolean.parseBoolean(stringBoolean);
        char charVal = stringChar.charAt(0);

        // Tampilkan hasil konversi
        System.out.println("Nilai int: " + intVal);
        System.out.println("Nilai float: " + floatVal);
        System.out.println("Nilai boolean: " + booleanVal);
        System.out.println("Nilai char: " + charVal);
    }
}


