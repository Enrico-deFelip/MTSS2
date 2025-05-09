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
        /** Test per i casi null */
        assertEquals("", IntegerToRoman.Convert(0));
        assertEquals("", IntegerToRoman.Convert(-1));
        assertEquals("", IntegerToRoman.Convert(-1000));

        /** Test per i primi tre numeri */
        assertEquals("I", IntegerToRoman.Convert(1));
        assertEquals("II", IntegerToRoman.Convert(2));
        assertEquals("III", IntegerToRoman.Convert(3));

        /** Test per i casi limite */
        assertEquals("IV", IntegerToRoman.Convert(4));
        assertEquals("VIII", IntegerToRoman.Convert(8));
        assertEquals("IX", IntegerToRoman.Convert(9));
        assertEquals("XVI", IntegerToRoman.Convert(16));
        assertEquals("XL", IntegerToRoman.Convert(40));
        assertEquals("XLIX", IntegerToRoman.Convert(49));
        assertEquals("XC", IntegerToRoman.Convert(90));
        assertEquals("CDXC", IntegerToRoman.Convert(490));
        assertEquals("CMXCIX", IntegerToRoman.Convert(999));
        assertEquals("M", IntegerToRoman.Convert(1000));
    }
}