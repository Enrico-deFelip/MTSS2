//////////////////////////////////////////////////////////////////// 
// Jaume Bernardi 2069428 
// Enrico Paolo de Felip 2077680 
////////////////////////////////////////////////////////////////////

package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterAAATest {
    @Test
    public void testAsciiArt() {
        String expectedAsciiArtFrom500 =  " _____  \n" +
                                          "|  __ \\ \n" +
                                          "| |  | |\n" +
                                          "| |  | |\n" +
                                          "| |__| |\n" +
                                          "|_____/ \n";

        assertEquals("\n" + expectedAsciiArtFrom500, RomanPrinter.print(500));

        String expectedAsciiArtFrom998 =  "  _____ "  + "  __  __ "  + " __   __"   + "   _____ "  + " __      __"   + "  _____ " + "  _____ " + "  _____ \n" +
                                          " / ____|"  + " |  \\/  |" + " \\ \\ / /" + "  / ____|"  + " \\ \\    / /" + " |_   _|" + " |_   _|" + " |_   _|\n" +
                                          "| |     "  + " | \\  / |" + "  \\ V / "  + " | |     "  + "  \\ \\  / / " + "   | |  " + "   | |  " + "   | |  \n" +
                                          "| |     "  + " | |\\/| |" + "   > <  "   + " | |     "  + "   \\ \\/ /  " + "   | |  " + "   | |  " + "   | |  \n" +
                                          "| |____ "  + " | |  | |"  + "  / . \\ "  + " | |____ "  + "    \\  /   "  + "  _| |_ " + "  _| |_ " + "  _| |_ \n" +
                                          " \\_____|" + " |_|  |_|"  + " /_/ \\_\\" + "  \\_____|" + "     \\/    "  + " |_____|" + " |_____|" + " |_____|\n";
        assertEquals("\n" + expectedAsciiArtFrom998, RomanPrinter.print(998));
    }
}
