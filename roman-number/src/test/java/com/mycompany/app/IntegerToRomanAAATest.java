//////////////////////////////////////////////////////////////////// 
// Jaume Bernardi 2069428 
// Enrico Paolo de Felip 2077680 
////////////////////////////////////////////////////////////////////

package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanAAATest {
    
    @Test
    public void testConvert() {
        /** Test per i primi tre numeri */
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));

        /** Test per i casi null */
        assertEquals("", IntegerToRoman.convert(0));
        assertEquals("", IntegerToRoman.convert(-1));

        /** Test per i casi limite */
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("VIII", IntegerToRoman.convert(8));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XVI", IntegerToRoman.convert(16));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XLIX", IntegerToRoman.convert(49));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("CDXC", IntegerToRoman.convert(490));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
        assertEquals("M", IntegerToRoman.convert(1000));
    }
}