import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsConverterTest {

    @Test
    public void shouldReturnOne_WhenGivenI() {
        var RomanNumerals = new RomanNumerals();
        String number = "I";
        assertThat(RomanNumerals.convertFromRoman(number)).isEqualTo(1);
    }

    @Test
    public void shouldReturnTwo_WhenGivenII() {
        var romanNumerals = new RomanNumerals();
        String number = "II";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(2);
    }

    @Test
    public void shouldReturnThree_WhenGivenIII() {
        var romanNumerals = new RomanNumerals();
        String number = "III";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(3);
    }

    @Test
    public void shouldReturnFour_WhenGivenIV() {
        var romanNumerals = new RomanNumerals();
        String number = "IV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(4);
    }

    @Test
    public void shouldReturnFive_WhenGivenV() {
        var romanNumerals = new RomanNumerals();
        String number = "V";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(5);
    }

    @Test
    public void shouldReturnSix_WhenGivenVI() {
        var romanNumerals = new RomanNumerals();
        String number = "VI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(6);
    }

    @Test
    public void shouldReturnSeven_WhenGivenVII() {
        var romanNumerals = new RomanNumerals();
        String number = "VII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(7);
    }

    @Test
    public void shouldReturnEight_WhenGivenVIII() {
        var romanNumerals = new RomanNumerals();
        String number = "VIII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(8);
    }

    @Test
    public void shouldReturnNine_WhenGivenIX() {
        var romanNumerals = new RomanNumerals();
        String number = "IX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(9);
    }

    @Test
    public void shouldReturnTen_WhenGivenX() {
        var romanNumerals = new RomanNumerals();
        String number = "X";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(10);
    }

    @Test
    public void shouldReturnEleven_WhenGivenXI() {
        var romanNumerals = new RomanNumerals();
        String number = "XI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(11);
    }

    @Test
    public void shouldReturnTwelve_WhenGivenXII() {
        var romanNumerals = new RomanNumerals();
        String number = "XII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(12);
    }

    @Test
    public void shouldReturnThirteen_WhenGivenXIII() {
        var romanNumerals = new RomanNumerals();
        String number = "XIII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(13);
    }

    @Test
    public void shouldReturnFourteen_WhenGivenXIV() {
        var romanNumerals = new RomanNumerals();
        String number = "XIV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(14);
    }

    @Test
    public void shouldReturnFifteen_WhenGivenXV() {
        var romanNumerals = new RomanNumerals();
        String number = "XV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(15);
    }

    @Test
    public void shouldReturnSixteen_WhenGivenXVI() {
        var romanNumerals = new RomanNumerals();
        String number = "XVI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(16);
    }

    @Test
    public void shouldReturnSeventeen_WhenGivenXVII() {
        var romanNumerals = new RomanNumerals();
        String number = "XVII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(17);
    }

    @Test
    public void shouldReturnEighteen_WhenGivenXVIII() {
        var romanNumerals = new RomanNumerals();
        String number = "XVIII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(18);
    }

    @Test
    public void shouldReturnNineteen_WhenGivenXIX() {
        var romanNumerals = new RomanNumerals();
        String number = "XIX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(19);
    }

    @Test
    public void shouldReturnTwenty_WhenGivenXX() {
        var romanNumerals = new RomanNumerals();
        String number = "XX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(20);
    }

    @Test
    public void shouldReturnTwentyOne_WhenGivenXXI() {
        var romanNumerals = new RomanNumerals();
        String number = "XXI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(21);
    }

    @Test
    public void shouldReturnTwentyTwo_WhenGivenXXII() {
        var romanNumerals = new RomanNumerals();
        String number = "XXII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(22);
    }

    @Test
    public void shouldReturnTwentyThree_WhenGivenXXIII() {
        var romanNumerals = new RomanNumerals();
        String number = "XXIII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(23);
    }

    @Test
    public void shouldReturnTwentyFour_WhenGivenXXIV() {
        var romanNumerals = new RomanNumerals();
        String number = "XXIV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(24);
    }

    @Test
    public void shouldReturnTwentyFive_WhenGivenXXV() {
        var romanNumerals = new RomanNumerals();
        String number = "XXV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(25);
    }

    @Test
    public void shouldReturnTwentySix_WhenGivenXXVI() {
        var romanNumerals = new RomanNumerals();
        String number = "XXVI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(26);
    }

    @Test
    public void shouldReturnTwentySeven_WhenGivenXXVII() {
        var romanNumerals = new RomanNumerals();
        String number = "XXVII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(27);
    }

    @Test
    public void shouldReturnTwentyEight_WhenGivenXXVIII() {
        var romanNumerals = new RomanNumerals();
        String number = "XXVIII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(28);
    }

    @Test
    public void shouldReturnTwentyNine_WhenGivenXXIX() {
        var romanNumerals = new RomanNumerals();
        String number = "XXIX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(29);
    }

    @Test
    public void shouldReturnThirty_WhenGivenXXX() {
        var romanNumerals = new RomanNumerals();
        String number = "XXX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(30);
    }

    @Test
    public void shouldReturnThirtyOne_WhenGivenXXXI() {
        var romanNumerals = new RomanNumerals();
        String number = "XXXI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(31);
    }

    @Test
    public void shouldReturnFifty_WhenGivenL() {
        var romanNumerals = new RomanNumerals();
        String number = "L";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(50);
    }

    @Test
    public void shouldReturnForty_WhenGivenXL() {
        var romanNumerals = new RomanNumerals();
        String number = "XL";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(40);
    }

    @Test
    public void shouldReturnFortyOne_WhenGivenXLI() {
        var romanNumerals = new RomanNumerals();
        String number = "XLI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(41);
    }

    @Test
    public void shouldReturnNinety_WhenGivenXC() {
        var romanNumerals = new RomanNumerals();
        String number = "XC";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(90);
    }

    @Test
    public void shouldReturnNinetyOne_WhenGivenXCI() {
        var romanNumerals = new RomanNumerals();
        String number = "XCI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(91);
    }

    @Test
    public void shouldReturnNinetyTwo_WhenGivenXCII() {
        var romanNumerals = new RomanNumerals();
        String number = "XCII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(92);
    }

    @Test
    public void shouldReturnNinetyThree_WhenGivenXCIII() {
        var romanNumerals = new RomanNumerals();
        String number = "XCIII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(93);
    }

    @Test
    public void shouldReturnNinetyFour_WhenGivenXCIV() {
        var romanNumerals = new RomanNumerals();
        String number = "XCIV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(94);
    }

    @Test
    public void shouldReturnNinetyFive_WhenGivenXCV() {
        var romanNumerals = new RomanNumerals();
        String number = "XCV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(95);
    }

    @Test
    public void shouldReturnNinetySix_WhenGivenXCVI() {
        var romanNumerals = new RomanNumerals();
        String number = "XCVI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(96);
    }

    @Test
    public void shouldReturnNinetySeven_WhenGivenXCVII() {
        var romanNumerals = new RomanNumerals();
        String number = "XCVII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(97);
    }

    @Test
    public void shouldReturnNinetyEight_WhenGivenXCVIII() {
        var romanNumerals = new RomanNumerals();
        String number = "XCVIII";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(98);
    }

    @Test
    public void shouldReturnNinetyNine_WhenGivenXCIX() {
        var romanNumerals = new RomanNumerals();
        String number = "XCIX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(99);
    }

    @Test
    public void shouldReturnOneHundred_WhenGivenC() {
        var romanNumerals = new RomanNumerals();
        String number = "C";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(100);
    }

    @Test
    public void shouldReturnOneHundredOne_WhenGivenCI() {
        var romanNumerals = new RomanNumerals();
        String number = "CI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(101);
    }

    @Test
    public void shouldReturnFourHundred_WhenGivenCD() {
        var romanNumerals = new RomanNumerals();
        String number = "CD";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(400);
    }

    @Test
    public void shouldReturnFourHundredOne_WhenGivenCDI() {
        var romanNumerals = new RomanNumerals();
        String number = "CDI";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(401);
    }

    @Test
    public void shouldReturnFourHundredTen_WhenGivenCDX() {
        var romanNumerals = new RomanNumerals();
        String number = "CDX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(410);
    }

    @Test
    public void shouldReturnFourHundredForty_WhenGivenCDXL() {
        var romanNumerals = new RomanNumerals();
        String number = "CDXL";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(440);
    }

    @Test
    public void shouldReturnOneThousand_WhenGivenM() {
        var romanNumerals = new RomanNumerals();
        String number = "M";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(1000);
    }

    @Test
    public void shouldReturnOneThousandTwentyFive_WhenGivenMXXV() {
        var romanNumerals = new RomanNumerals();
        String number = "MXXV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(1025);
    }

    @Test
    public void shouldReturnOneThousandFortyFive_WhenGivenMXLV() {
        var romanNumerals = new RomanNumerals();
        String number = "MXLV";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(1045);
    }

    @Test
    public void shouldReturnOneThousandNineHundredNinetyNine_WhenGivenMCMXCIX() {
        var romanNumerals = new RomanNumerals();
        String number = "MCMXCIX";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(1999);
    }

    @Test
    public void shouldReturnTwoThousand_WhenGivenMM() {
        var romanNumerals = new RomanNumerals();
        String number = "MM";
        assertThat(romanNumerals.convertFromRoman(number)).isEqualTo(2000);
    }
}