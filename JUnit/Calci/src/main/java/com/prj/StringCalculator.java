package com.prj;



import java.util.Arrays;

public class StringCalculator {

    public static int add(String n) {
        if (n.isEmpty()) {
            return 0;
        }
        String[] numberArray = n.split("[,\n]");

        int sum = 0;
        //String negatives = new String();

        for (String numStr : numberArray) {
            int number = Integer.parseInt(numStr);
            if (number < 0) {
                throw new IllegalArgumentException("Negatives not allowed");
            } else if (number <= 1000) {
                sum += number;
            }
        }
        return sum;
    }
}

