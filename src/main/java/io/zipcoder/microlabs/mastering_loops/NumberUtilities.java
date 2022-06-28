package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                str.append(i);
            }
        }
        return str.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                str.append(i);
            }
        }
        return str.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
       return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(i);
        }
        return str.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(Math.round(Math.pow(i, exponent)));
        }
        return str.toString();
    }
}
