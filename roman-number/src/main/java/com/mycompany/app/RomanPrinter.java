//////////////////////////////////////////////////////////////////// 
// Jaume Bernardi 2069428 
// Enrico Paolo de Felip 2077680 
////////////////////////////////////////////////////////////////////

package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    private static final Map<Character, String[]> romanAsciiMap = new HashMap<>();

    static {
        romanAsciiMap.put('I', new String[]{
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        });
        romanAsciiMap.put('V', new String[]{
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        });
        romanAsciiMap.put('X', new String[]{
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\"
        });
        romanAsciiMap.put('L', new String[]{
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |____ ",
            "|______|"
        });
        romanAsciiMap.put('C', new String[]{
            "  _____ ",
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|"
        });
        romanAsciiMap.put('D', new String[]{
            " _____  ",
            "|  __ \\ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ "
        });
        romanAsciiMap.put('M', new String[]{
            " __  __ ",
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|"
        });
    }

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    
    private static String printAsciiArt(String romanNumber){
        StringBuilder result = new StringBuilder();
        result.append("\n");
        
        for (int i = 0; i < 6; i++) {
            int j = 0;
            for (char c : romanNumber.toCharArray()) {
                String[] asciiArt = romanAsciiMap.get(c);
                j += 1;
                if (asciiArt != null) {
                    result.append(asciiArt[i]);
                    if (j != romanNumber.length()) {
                        result.append(" "); // Aggiungi spazio tra i simboli
                    }
                }
            }
            result.append("\n"); // Aggiungi nuova linea alla fine di ogni riga
        }
        return result.toString();
    }
    
}
