
public class RomanNumerals {
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
}
