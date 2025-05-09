//////////////////////////////////////////////////////////////////// 
// Jaume Bernardi 2069428 
// Enrico Paolo de Felip 2077680 
////////////////////////////////////////////////////////////////////

package com.mycompany.app;

public class IntegerToRoman {

    private static final int[] valori = {1, 5, 10, 50, 100, 500, 1000};
    private static final String[] simboli = {"I", "V", "X", "L", "C", "D", "M"};

    public static String convert(int number) {
        int base = valori.length - 1;
        return convert(number, base);
    }

    public static String convert(int n, int l) {
        if (n >= valori[l]) {
            n -= valori[l];
            return simboli[l] + convert(n, l);
        }

        else {
            if (n > 0){
                if (n >= (valori[l] - valori[precedenteValido(l)])) {
                    n -= (valori[l]- valori[precedenteValido(l)]);
                    return simboli[precedenteValido(l)] + simboli[l] + convert(n, l-1);
                }
                else {
                    return convert(n, l-1);
                }
            }
            
            else {
                return "";   
            }
        }
    }

    private static int precedenteValido(int l) {
        int i = 4;
        int b = 4;
        while (i > 0) {
            if (l > b){
                i = 0;
            }
            else {
                b = i = i-2;
            }
        }
        return b;
    }
}
