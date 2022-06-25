package io.zipcoder.microlabs.mastering_loops;

//import com.sun.org.apache.xpath.internal.operations.String;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                table.append(java.lang.String.format("%3d |", i * j));
                if (j == 5) {
                    table.append("\n");
                }
            }
        }
        return table.toString();
    }

    public static String getLargeMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                table.append(java.lang.String.format("%3d |", i * j));
                if (j == 10) {
                    table.append("\n");
                }
            }
        }
        return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                table.append(java.lang.String.format("%3d |", i * j));
                if (j == tableSize) {
                    table.append("\n");
                }
            }
        }
        return table.toString();
    }
}
