////////////////////////////////////////////////////////////////////
// GIACOMO PESENATO 2076429
// FRANCESCO FRAGONAS 2076436
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {

    @Test(expected=IllegalArgumentException.class)
    public void testZeroNumber() {
        int num = 0;
        String result = IntegerToRoman.convert(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNegativeNumber() {
        int num = -1;
        String result = IntegerToRoman.convert(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testNumberOutOfRange() {
        int num = 51;
        String result = IntegerToRoman.convert(num);
    }

    @Test
    public void testFirstThreeNumbers() {
        int[] decimalNumbers = {1,3};
        String[] romanNumbers = {"I", "III"};
        for (int i=0; i<decimalNumbers.length; i++) {
            assertEquals(IntegerToRoman.convert(decimalNumbers[i]), romanNumbers[i]);
        }
    }

    @Test
    public void testFirstSixNumbers() {
        int[] decimalNumbers = {4,6};
        String[] romanNumbers = {"IV", "VI"};
        for (int i=0; i<decimalNumbers.length; i++) {
            assertEquals(IntegerToRoman.convert(decimalNumbers[i]), romanNumbers[i]);
        }
    }

    @Test
    public void testFirstTenNumbers() {
        int[] decimalNumbers = {7,9,10};
        String[] romanNumbers = {"VII", "IX", "X"};
        for (int i=0; i<decimalNumbers.length; i++) {
            assertEquals(IntegerToRoman.convert(decimalNumbers[i]), romanNumbers[i]);
        }
    }

    @Test
    public void testFirstTwentyNumbers() {
        int[] decimalNumbers = {11,14,15,16,19,20};
        String[] romanNumbers = {"XI", "XIV", "XV", "XVI", "XIX", "XX"};
        for (int i=0; i<decimalNumbers.length; i++) {
            assertEquals(IntegerToRoman.convert(decimalNumbers[i]), romanNumbers[i]);
        }
    }

    @Test
    public void testFirstFiftyNumbers() {
        int[] decimalNumbers = {21,29,30,35,40,44,50};
        String[] romanNumbers = {"XXI", "XXIX", "XXX", "XXXV", "XL", "XLIV", "L"};
        for (int i=0; i<decimalNumbers.length; i++) {
            assertEquals(IntegerToRoman.convert(decimalNumbers[i]), romanNumbers[i]);
        }
    }

}
