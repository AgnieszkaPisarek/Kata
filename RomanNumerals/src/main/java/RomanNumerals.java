import java.util.ArrayList;
import java.util.List;

public class RomanNumerals {
    public String convertToRoman(int number) {

        StringBuilder roman = new StringBuilder();
        List<String[]> signs = new ArrayList<>();

        signs.add(new String[]{"M", "CM", "D", "CD"});
        signs.add(new String[]{"C", "XC", "L", "XL"});
        signs.add(new String[]{"X", "IX", "V", "IV"});
        signs.add(new String[]{"I", "-", "-", "-"});

        int[] breakpoints = new int[]{1000, 900, 500, 400};

        for (int i = 0; i < 4; i++) {

            while (number >= breakpoints[0]) {
                roman.append(signs.get(i)[0]);
                number -= breakpoints[0];
            }

            if (number == 0)    return roman.toString();

            if (number >= breakpoints[1])    {
                roman.append(signs.get(i)[1]);
                number -= breakpoints[1];
            }

            if (number >= breakpoints[2])    {
                roman.append(signs.get(i)[2]);
                number -= breakpoints[2];
            }

            if (number >= breakpoints[3])    {
                roman.append(signs.get(i)[3]);
                number -= breakpoints[3];
            }

            for(int j = 0; j < 4; j++) {
                breakpoints[j] /= 10;
            }
        }

        return roman.toString();
    }
}
