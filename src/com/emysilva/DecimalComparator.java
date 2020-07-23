package com.emysilva;

import java.text.DecimalFormat;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.175));
    }
        public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
            if ((num1 < 0 && num2 < 0) || (num1 > 0 && num2 > 0)) {
                double roundNum1 = num1;
                double roundNum2 = (double)Math.round(num2 * 10000d) / 10000d;
                if (roundNum1 == roundNum2) {
                    return true;
                }
                return false;
            }
            return false;
    }
}
