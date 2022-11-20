package com.kalkulator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.println("KALKUNLATOR");
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Input User: " + a + " " + operator + " " + b);

        //operator tersedia
        
        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            hasil = a / b;
            System.out.println("Hasil = " + hasil);
        } else {
            System.out.println("Operator tidak ditemukan");
        }

    }
}