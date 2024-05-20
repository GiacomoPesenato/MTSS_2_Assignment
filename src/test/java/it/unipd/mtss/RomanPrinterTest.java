////////////////////////////////////////////////////////////////////
// GIACOMO PESENATO 2076429
// FRANCESCO FRAGONAS 2076436
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanPrinterTest {
    @Test(expected=IllegalArgumentException.class)
    public void testZeroNumber() {
        int num = 0;
        String result = RomanPrinter.print(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNegativeNumber() {
        int num = -1;
        String result = RomanPrinter.print(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNumberOutOfRange() {
        int num = 7;
        String result = IntegerToRoman.convert(num);
    }

    @Test
    public void testFirstThreeNumbers() {
        int[] decimalNumbers = {1,3};
        String[] romanNumbers = {
                        " _____ \n" + //
                        "|_   _|\n" + //
                        "  | |  \n" + //
                        "  | |  \n" + //
                        " _| |_ \n" + //
                        "|_____|\n",
                        " _____  _____  _____ \n" + //
                        "|_   _||_   _||_   _|\n" + //
                        "  | |    | |    | |  \n" + //
                        "  | |    | |    | |  \n" + //
                        " _| |_  _| |_  _| |_ \n" + //
                        "|_____||_____||_____|\n"};

        for (int i=0; i<decimalNumbers.length; i++){
            assertEquals(RomanPrinter.print(decimalNumbers[i]).trim(), romanNumbers[i].trim());
        }
    }

    @Test
    public void testFirstSixNumbers() {
        int[] decimalNumbers = {4, 6};
        String[] romanNumbers = {
                " _____ __      __ \n" +
                        "|_   _|\\ \\    / / \n" +
                        "  | |   \\ \\  / /  \n" +
                        "  | |    \\ \\/ /   \n" +
                        " _| |_    \\  /    \n" +
                        "|_____|    \\/     ",
                "__      __  _____ \n" +
                        "\\ \\    / / |_   _|\n" +
                        " \\ \\  / /    | |  \n" +
                        "  \\ \\/ /     | |  \n" +
                        "   \\  /     _| |_ \n" +
                        "    \\/     |_____|"};

        for (int i=0; i<decimalNumbers.length; i++){
            assertEquals(RomanPrinter.print(decimalNumbers[i]).trim(), romanNumbers[i].trim());
        }
    }
}