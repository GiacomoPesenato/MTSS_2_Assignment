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
        int num = 101;
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

    @Test
    public void testFirstTenNumbers() {
        int[] decimalNumbers = {7,9,10};
        String[] romanNumbers = {
                "__      __  _____  _____ \n" +
                        "\\ \\    / / |_   _||_   _|\n" +
                        " \\ \\  / /    | |    | |  \n" +
                        "  \\ \\/ /     | |    | |  \n" +
                        "   \\  /     _| |_  _| |_ \n" +
                        "    \\/     |_____||_____|",
                " _____ __   __ \n" +
                        "|_   _|\\ \\ / / \n" +
                        "  | |   \\ V /  \n" +
                        "  | |    > <   \n" +
                        " _| |_  / . \\  \n" +
                        "|_____|/_/ \\_\\",
                "__   __ \n" +
                        "\\ \\ / / \n" +
                        " \\ V /  \n" +
                        "  > <   \n" +
                        " / . \\  \n" +
                        "/_/ \\_\\ "};

        for (int i=0; i<decimalNumbers.length; i++){
            assertEquals(RomanPrinter.print(decimalNumbers[i]).trim(), romanNumbers[i].trim());
        }
    }

    @Test
    public void testFirstTwentyNumbers() {
        int[] decimalNumbers = {11,14,15,16,19,20};
        String[] romanNumbers = {
                "__   __  _____ \n" +
                        "\\ \\ / / |_   _|\n" +
                        " \\ V /    | |  \n" +
                        "  > <     | |  \n" +
                        " / . \\   _| |_ \n" +
                        "/_/ \\_\\ |_____|",
                "__   __  _____ __      __ \n" +
                        "\\ \\ / / |_   _|\\ \\    / / \n" +
                        " \\ V /    | |   \\ \\  / /  \n" +
                        "  > <     | |    \\ \\/ /   \n" +
                        " / . \\   _| |_    \\  /    \n" +
                        "/_/ \\_\\ |_____|    \\/     ",
                "__   __ __      __ \n" +
                        "\\ \\ / / \\ \\    / / \n" +
                        " \\ V /   \\ \\  / /  \n" +
                        "  > <     \\ \\/ /   \n" +
                        " / . \\     \\  /    \n" +
                        "/_/ \\_\\     \\/     ",
                "__   __ __      __  _____ \n" +
                        "\\ \\ / / \\ \\    / / |_   _|\n" +
                        " \\ V /   \\ \\  / /    | |  \n" +
                        "  > <     \\ \\/ /     | |  \n" +
                        " / . \\     \\  /     _| |_ \n" +
                        "/_/ \\_\\     \\/     |_____|",
                "__   __  _____ __   __ \n" +
                        "\\ \\ / / |_   _|\\ \\ / / \n" +
                        " \\ V /    | |   \\ V /  \n" +
                        "  > <     | |    > <   \n" +
                        " / . \\   _| |_  / . \\  \n" +
                        "/_/ \\_\\ |_____|/_/ \\_\\ ",
                "__   __ __   __ \n" +
                        "\\ \\ / / \\ \\ / / \n" +
                        " \\ V /   \\ V /  \n" +
                        "  > <     > <   \n" +
                        " / . \\   / . \\  \n" +
                        "/_/ \\_\\ /_/ \\_\\ "
        };

        for (int i=0; i<decimalNumbers.length; i++){
            assertEquals(RomanPrinter.print(decimalNumbers[i]).trim(), romanNumbers[i].trim());
        }
    }

    @Test
    public void testFirstFiftyNumbers() {
        int[] decimalNumbers = {21,29,30,35,40,44,50};
        String[] romanNumbers = {
                "__   __ __   __  _____ \n" +
                        "\\ \\ / / \\ \\ / / |_   _|\n" +
                        " \\ V /   \\ V /    | |  \n" +
                        "  > <     > <     | |  \n" +
                        " / . \\   / . \\   _| |_ \n" +
                        "/_/ \\_\\ /_/ \\_\\ |_____|",
                "__   __ __   __  _____ __   __ \n" +
                        "\\ \\ / / \\ \\ / / |_   _|\\ \\ / / \n" +
                        " \\ V /   \\ V /    | |   \\ V /  \n" +
                        "  > <     > <     | |    > <   \n" +
                        " / . \\   / . \\   _| |_  / . \\  \n" +
                        "/_/ \\_\\ /_/ \\_\\ |_____|/_/ \\_\\",
                "__   __ __   __ __   __ \n" +
                        "\\ \\ / / \\ \\ / / \\ \\ / / \n" +
                        " \\ V /   \\ V /   \\ V /  \n" +
                        "  > <     > <     > <   \n" +
                        " / . \\   / . \\   / . \\  \n" +
                        "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\ ",
                "__   __ __   __ __   __ __      __ \n" +
                        "\\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / \n" +
                        " \\ V /   \\ V /   \\ V /   \\ \\  / /  \n" +
                        "  > <     > <     > <     \\ \\/ /   \n" +
                        " / . \\   / . \\   / . \\     \\  /    \n" +
                        "/_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/     ",
                "__   __  _      \n" +
                        "\\ \\ / / | |     \n" +
                        " \\ V /  | |     \n" +
                        "  > <   | |     \n" +
                        " / . \\  | |____ \n" +
                        "/_/ \\_\\ |______|",
                "__   __  _       _____ __      __ \n" +
                        "\\ \\ / / | |     |_   _|\\ \\    / / \n" +
                        " \\ V /  | |       | |   \\ \\  / /  \n" +
                        "  > <   | |       | |    \\ \\/ /   \n" +
                        " / . \\  | |____  _| |_    \\  /    \n" +
                        "/_/ \\_\\ |______||_____|    \\/     ",
                " _      \n" +
                        "| |     \n" +
                        "| |     \n" +
                        "| |     \n" +
                        "| |____ \n" +
                        "|______|"
        };

        for (int i=0; i<decimalNumbers.length; i++){
            assertEquals(RomanPrinter.print(decimalNumbers[i]).trim(), romanNumbers[i].trim());
        }
    }

    @Test
    public void testFirstHundredNumbers() {
        int[] decimalNumbers = {51,54,60,74,84,86,89,90,94,95,99,100};
        String[] romanNumbers = {
                " _       _____ \n" +
                        "| |     |_   _|\n" +
                        "| |       | |  \n" +
                        "| |       | |  \n" +
                        "| |____  _| |_ \n" +
                        "|______||_____|",
                " _       _____ __      __ \n" +
                        "| |     |_   _|\\ \\    / / \n" +
                        "| |       | |   \\ \\  / /  \n" +
                        "| |       | |    \\ \\/ /   \n" +
                        "| |____  _| |_    \\  /    \n" +
                        "|______||_____|    \\/    ",
                " _      __   __ \n" +
                        "| |     \\ \\ / / \n" +
                        "| |      \\ V /  \n" +
                        "| |       > <   \n" +
                        "| |____  / . \\  \n" +
                        "|______|/_/ \\_\\  ",
                " _      __   __ __   __  _____ __      __ \n" +
                        "| |     \\ \\ / / \\ \\ / / |_   _|\\ \\    / / \n" +
                        "| |      \\ V /   \\ V /    | |   \\ \\  / /  \n" +
                        "| |       > <     > <     | |    \\ \\/ /   \n" +
                        "| |____  / . \\   / . \\   _| |_    \\  /    \n" +
                        "|______|/_/ \\_\\ /_/ \\_\\ |_____|    \\/    ",
                " _      __   __ __   __ __   __  _____ __      __ \n" +
                        "| |     \\ \\ / / \\ \\ / / \\ \\ / / |_   _|\\ \\    / / \n" +
                        "| |      \\ V /   \\ V /   \\ V /    | |   \\ \\  / /  \n" +
                        "| |       > <     > <     > <     | |    \\ \\/ /   \n" +
                        "| |____  / . \\   / . \\   / . \\   _| |_    \\  /    \n" +
                        "|______|/_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____|    \\/     ",
                " _      __   __ __   __ __   __ __      __  _____ \n" +
                        "| |     \\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / |_   _|\n" +
                        "| |      \\ V /   \\ V /   \\ V /   \\ \\  / /    | |  \n" +
                        "| |       > <     > <     > <     \\ \\/ /     | |  \n" +
                        "| |____  / . \\   / . \\   / . \\     \\  /     _| |_ \n" +
                        "|______|/_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/     |_____|",
                "  _      __   __ __   __ __   __  _____ __   __ \n" +
                        "| |     \\ \\ / / \\ \\ / / \\ \\ / / |_   _|\\ \\ / / \n" +
                        "| |      \\ V /   \\ V /   \\ V /    | |   \\ V /  \n" +
                        "| |       > <     > <     > <     | |    > <   \n" +
                        "| |____  / . \\   / . \\   / . \\   _| |_  / . \\  \n" +
                        "|______|/_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____|/_/ \\_\\ ",
                "__   __   _____ \n" +
                        "\\ \\ / /  / ____|\n" +
                        " \\ V /  | |     \n" +
                        "  > <   | |     \n" +
                        " / . \\  | |____ \n" +
                        "/_/ \\_\\  \\_____|",
                "__   __   _____  _____ __      __ \n" +
                        "\\ \\ / /  / ____||_   _|\\ \\    / / \n" +
                        " \\ V /  | |       | |   \\ \\  / /  \n" +
                        "  > <   | |       | |    \\ \\/ /   \n" +
                        " / . \\  | |____  _| |_    \\  /    \n" +
                        "/_/ \\_\\  \\_____||_____|    \\/     ",
                "__   __   _____ __      __ \n" +
                        "\\ \\ / /  / ____|\\ \\    / / \n" +
                        " \\ V /  | |      \\ \\  / /  \n" +
                        "  > <   | |       \\ \\/ /   \n" +
                        " / . \\  | |____    \\  /    \n" +
                        "/_/ \\_\\  \\_____|    \\/     ",
                "__   __   _____  _____ __   __ \n" +
                        "\\ \\ / /  / ____||_   _|\\ \\ / / \n" +
                        " \\ V /  | |       | |   \\ V /  \n" +
                        "  > <   | |       | |    > <   \n" +
                        " / . \\  | |____  _| |_  / . \\  \n" +
                        "/_/ \\_\\  \\_____||_____|/_/ \\_\\ ",
                "  _____ \n" +
                        " / ____|\n" +
                        "| |     \n" +
                        "| |     \n" +
                        "| |____ \n" +
                        " \\_____|"
        };

        for (int i=0; i<decimalNumbers.length; i++){
            assertEquals(RomanPrinter.print(decimalNumbers[i]).trim(), romanNumbers[i].trim());
        }
    }
}