package org.sanvalero;

public class ConversorNumerosRomanos {

    public static String convertirARomano(int decimal) {
        if (decimal < 1 || decimal > 3000) {
            throw new IllegalArgumentException("El número decimal debe estar entre 1 y 3000");
        }

        String romano = "";
        int remanente = decimal;

        while (remanente >= 1000) {
            romano += "M";
            remanente -= 1000;
        }
        while (remanente >= 900) {
            romano += "CM";
            remanente -= 900;
        }
        while (remanente >= 500) {
            romano += "D";
            remanente -= 500;
        }
        while (remanente >= 400) {
            romano += "CD";
            remanente -= 400;
        }
        while (remanente >= 100) {
            romano += "C";
            remanente -= 100;
        }
        while (remanente >= 90) {
            romano += "XC";
            remanente -= 90;
        }
        while (remanente >= 50) {
            romano += "L";
            remanente -= 50;
        }
        while (remanente >= 40) {
            romano += "XL";
            remanente -= 40;
        }
        while (remanente >= 10) {
            romano += "X";
            remanente -= 10;
        }
        while (remanente >= 9) {
            romano += "IX";
            remanente -= 9;
        }
        while (remanente >= 5) {
            romano += "V";
            remanente -= 5;
        }
        while (remanente >= 4) {
            romano += "IV";
            remanente -= 4;
        }
        while (remanente >= 1) {
            romano += "I";
            remanente -= 1;
        }

        return romano;
    }

}
