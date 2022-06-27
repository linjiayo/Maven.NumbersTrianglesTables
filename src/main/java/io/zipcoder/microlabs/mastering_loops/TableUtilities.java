package io.zipcoder.microlabs.mastering_loops;

//import com.sun.org.apache.xpath.internal.operations.String;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
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
