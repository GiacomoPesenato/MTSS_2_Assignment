////////////////////////////////////////////////////////////////////
// GIACOMO PESENATO 2076429
// FRANCESCO FRAGONAS 2076436
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.Arrays;
import java.util.HashMap;

public class RomanPrinter {
    public static String print(int num) throws IllegalArgumentException {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] matrix = new String[6];
        Arrays.fill(matrix, "");
        StringBuilder result = new StringBuilder();

        for (int letter = 0; letter < romanNumber.length(); letter++) {
            for (int line = 0; line < 6; line++) {
                matrix[line] += (getLetter(romanNumber.charAt(letter))[line]);
            }
        }

        for (int line = 0; line < 6; line++) {
            result.append(matrix[line]).append("\n");
        }

        return result.toString();
    }

    private static String[] getLetter(char letter) {
        HashMap<Character, String[]> map = new HashMap<Character, String[]>();

        map.put(
                'I',
                new String[] {
                        " _____ ",
                        "|_   _|",
                        "  | |  ",
                        "  | |  ",
                        " _| |_ ",
                        "|_____|"
                });

        map.put(
                'V',
                new String[] {
                        "__      __ ",
                        "\\ \\    / / ",
                        " \\ \\  / /  ",
                        "  \\ \\/ /   ",
                        "   \\  /    ",
                        "    \\/     "
                });

        map.put(
                'X',
                new String[] {
                        "__   __ ",
                        "\\ \\ / / ",
                        " \\ V /  ",
                        "  > <   ",
                        " / . \\  ",
                        "/_/ \\_\\ "
                });

        map.put(
                'L',
                new String[] {
                        " _      ",
                        "| |     ",
                        "| |     ",
                        "| |     ",
                        "| |____ ",
                        "|______|"
                });

        map.put(
                'C',
                new String[] {
                        "  _____ ",
                        " / ____|",
                        "| |     ",
                        "| |     ",
                        "| |____ ",
                        " \\_____|"
                });

        map.put(
                'D',
                new String[] {
                        " _____  ",
                        "|  __ \\ ",
                        "| |  | |",
                        "| |  | |",
                        "| |__| |",
                        "|_____/ "
                });

        map.put(
                'M',
                new String[] {
                        " __  __ ",
                        "|  \\/  |",
                        "| \\  / |",
                        "| |\\/| |",
                        "| |  | |",
                        "|_|  |_|"
                });

        return map.get(letter);
    }

}
