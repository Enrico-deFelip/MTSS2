//////////////////////////////////////////////////////////////////// 
// Jaume Bernardi 2069428 
// Enrico Paolo de Felip 2077680 
////////////////////////////////////////////////////////////////////

package com.mycompany.app;

public class IntegerToRoman {
    public static String Convert(int number){
        if (number > 0){
            return "I" + Convert(number - 1);
        }
        else {
            return "";
        }
    }
}
