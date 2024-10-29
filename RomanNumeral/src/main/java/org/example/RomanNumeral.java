package org.example;

import java.util.ArrayList;
import java.util.List;

public class RomanNumeral {

   public String convertToRoman(int number) {

        StringBuilder roman = new StringBuilder();
        String[] signs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] breakpoints = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < 13; i++) {

            while (number >= breakpoints[i]) {
                roman.append(signs[i]);
                number -= breakpoints[i];
            }
        }
        return roman.toString();
    }

    public int convertFromRoman(String roman) {
        List<Integer> parts = new ArrayList<>();
        int number = 0;

        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'M':
                    parts.add(1000);
                    break;
                case 'D':
                    parts.add(500);
                    break;
                case 'C':
                    parts.add(100);
                    break;
                case 'L':
                    parts.add(50);
                    break;
                case 'X':
                    parts.add(10);
                    break;
                case 'V':
                    parts.add(5);
                    break;
                case 'I':
                    parts.add(1);
                    break;
            }
        }
        for (int j = 0; j < parts.size() - 1; j++) {
            if (parts.get(j) < parts.get(j + 1)) {
                number -= parts.get(j);
            }   else {
                number += parts.get(j);
            }
        }

        number += parts.getLast();

        return number;
    }
}
