package org.sanvalero;

public class ConversorNumerosRomanos {

    public static String convertirARomano(int numeroDecimal) {
        if (numeroDecimal < 1 || numeroDecimal > 3000) {
            throw new IllegalArgumentException("El número decimal debe estar entre 1 y 3000");
        }

        int[] VALORES_DECIMALES = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] NUMEROS_ROMANOS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder numeroRomano = new StringBuilder();
        int remanente = numeroDecimal;

        for (int i = 0; i < VALORES_DECIMALES.length; i++) {
            while (remanente >= VALORES_DECIMALES[i]) {
                numeroRomano.append(NUMEROS_ROMANOS[i]);
                remanente -= VALORES_DECIMALES[i];
            }
        }

        return numeroRomano.toString();
    }

}
