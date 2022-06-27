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
       StringBuilder str = new StringBuilder();
       for (int i = start; i < stop; i += step) {
           str.append(i * i);
       }
       return str.toString();
    }

    public static String getRange(int stop) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < stop; i++) {
            str.append(i);
        }
        return str.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i++) {
            str.append(i);
        }
        return str.toString();
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
