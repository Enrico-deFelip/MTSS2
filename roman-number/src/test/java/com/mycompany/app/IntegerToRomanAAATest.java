//////////////////////////////////////////////////////////////////// 
// Jaume Bernardi 2069428 
// Enrico Paolo de Felip 2077680 
////////////////////////////////////////////////////////////////////

package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;;

public class IntegerToRomanAAATest {
    
    @Test
    public void testConvert() {
        assertEquals("I", IntegerToRoman.Convert(1));
        assertEquals("II", IntegerToRoman.Convert(2));
        assertEquals("III", IntegerToRoman.Convert(3));
    }
}