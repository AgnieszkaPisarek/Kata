public class RomanNumerals {
    public String convertToRoman(int number) {
        StringBuilder roman = new StringBuilder();

            while (number - 1000 >= 0) {
                roman.append("M");
                number -= 1000;
            }

            if (number > 900)    {
                roman.append("CM");
                number -= 900;
            }

            if (number >= 500)    {
                roman.append("D");
                number -= 500;
            }

            if (number > 399)    {
                roman.append("CD");
                number -= 400;
            }

            while (number - 100 >= 0) {
                roman.append("C");
                number -= 100;
            }

            if (number > 89)    {
                roman.append("XC");
                number -= 90;
            }

            while (number - 50 >= 0) {
                roman.append("L");
                number -= 50;
            }

            if (number > 39)    {
                roman.append("XL");
                number -= 40;
            }

            while (number - 10 >= 0) {
                roman.append("X");
                number -= 10;
            }

            if (number == 9)    {
                roman.append("IX");
                number -= 9;
            }

            if (number >= 5)    {
                roman.append("V");
                number -= 5;
            }

            if (number == 4)    {
                roman.append("IV");
                number -= 4;
            }

            while (number > 0) {
                roman.append("I");
                number--;
            }

        return roman.toString();
    }
}
