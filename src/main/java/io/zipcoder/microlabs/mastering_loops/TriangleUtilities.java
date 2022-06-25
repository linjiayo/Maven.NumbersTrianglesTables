package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < numberOfRows; i++) {
            str.append(getRow(i));
            str.append("\n");
        }
        return str.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            str.append("*");
        }
        return str.toString();
    }

    public static String getSmallTriangle() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            str.append(getRow(i));
            str.append("\n");
        }
        return str.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            str.append(getRow(i));
            str.append("\n");
        }
        return str.toString();
    }
}
