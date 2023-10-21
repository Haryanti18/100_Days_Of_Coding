package Coding;

public class day_13 {

    public static void main(String[] args) {
        // Deklarasi variabel
        int intVal = 123;
        float floatVal = 123.456f;
        boolean booleanVal = true;
        char charVal = 'A';

        // Konversi tipe data primitif ke string
        String stringInt = String.valueOf(intVal);
        String stringFloat = String.valueOf(floatVal);
        String stringBoolean = String.valueOf(booleanVal);
        String stringChar = String.valueOf(charVal);

        // Tampilkan hasil konversi
        System.out.println("Nilai int: " + stringInt);
        System.out.println("Nilai float: " + stringFloat);
        System.out.println("Nilai boolean: " + stringBoolean);
        System.out.println("Nilai char: " + stringChar);
    }
}

