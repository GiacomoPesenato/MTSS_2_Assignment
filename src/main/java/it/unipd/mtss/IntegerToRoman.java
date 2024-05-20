////////////////////////////////////////////////////////////////////
// GIACOMO PESENATO 2076429
// FRANCESCO FRAGONAS 2076436
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {

    private static final int limit = 3;
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1, "I");
    }

    public static String convert(int number) throws IllegalArgumentException{

        if(number == 0) {
            throw new IllegalArgumentException("Il numero non può essere uguale a 0");
        }

        if(number < 0) {
            throw new IllegalArgumentException("Il numero non può essere negativo");
        }

        if(number > limit) {
            throw new IllegalArgumentException("I numeri maggiori di " + limit + " non possono essere convertiti");
        }

        StringBuilder romanNumber = new StringBuilder();

        for(Integer key : map.descendingKeySet()) {
            while (number >= key) {
                romanNumber.append(map.get(key));
                number -= key;
            }
        }

        return romanNumber.toString();
    }
}
