//////////////////////////////////////////////////////////////////// 
// Jaume Bernardi 2069428 
// Enrico Paolo de Felip 2077680 
////////////////////////////////////////////////////////////////////

package com.mycompany.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        Integer number = scanner.nextInt();

        String romanNumeral = IntegerToRoman.convert(number);
        System.out.println("Il numero romano corrispondente è: " + romanNumeral);

        scanner.close();
    }
}