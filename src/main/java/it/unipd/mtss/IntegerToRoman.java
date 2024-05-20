////////////////////////////////////////////////////////////////////
// GIACOMO PESENATO 2076429
// FRANCESCO FRAGONAS 2076436
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {

    private static final int limit = 100 ;
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
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
