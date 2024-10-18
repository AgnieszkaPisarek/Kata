import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanNumeralsTest {

    @Test
    public void shouldGiveI_whenGivenOne()  {
        var RomanNumerals = new RomanNumerals();
        int number = 1;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("I");
    }

    @Test
    public void shouldGiveII_whenGivenTwo()  {
        var RomanNumerals = new RomanNumerals();
        int number = 2;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("II");
    }

    @Test
    public void shouldGiveIII_whenGivenThree()  {
        var RomanNumerals = new RomanNumerals();
        int number = 3;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("III");
    }

    @Test
    public void shouldGiveIV_whenGivenFour()  {
        var RomanNumerals = new RomanNumerals();
        int number = 4;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("IV");
    }

    @Test
    public void shouldGiveV_whenGivenFive()  {
        var RomanNumerals = new RomanNumerals();
        int number = 5;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("V");
    }

    @Test
    public void shouldGiveVI_whenGivenSix()  {
        var RomanNumerals = new RomanNumerals();
        int number = 6;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("VI");
    }

    @Test
    public void shouldGiveVII_whenGivenSeven()  {
        var RomanNumerals = new RomanNumerals();
        int number = 7;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("VII");
    }

    @Test
    public void shouldGiveVIII_whenGivenEight()  {
        var RomanNumerals = new RomanNumerals();
        int number = 8;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("VIII");
    }

    @Test
    public void shouldGiveIX_whenGivenNine()  {
        var RomanNumerals = new RomanNumerals();
        int number = 9;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("IX");
    }

    @Test
    public void shouldGiveX_whenGivenTen()  {
        var RomanNumerals = new RomanNumerals();
        int number = 10;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("X");
    }

    @Test
    public void shouldGiveXI_whenGivenEleven()  {
        var RomanNumerals = new RomanNumerals();
        int number = 11;
        assertThat(RomanNumerals.convertToRoman(number)).isEqualTo("XI");
    }

    @Test
    public void shouldGiveXII_whenGivenTwelve() {
        var romanNumerals = new RomanNumerals();
        int number = 12;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XII");
    }

    @Test
    public void shouldGiveXIII_whenGivenThirteen() {
        var romanNumerals = new RomanNumerals();
        int number = 13;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XIII");
    }

    @Test
    public void shouldGiveXIV_whenGivenFourteen() {
        var romanNumerals = new RomanNumerals();
        int number = 14;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XIV");
    }

    @Test
    public void shouldGiveXV_whenGivenFifteen() {
        var romanNumerals = new RomanNumerals();
        int number = 15;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XV");
    }

    @Test
    public void shouldGiveXVI_whenGivenSixteen() {
        var romanNumerals = new RomanNumerals();
        int number = 16;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XVI");
    }

    @Test
    public void shouldGiveXVII_whenGivenSeventeen() {
        var romanNumerals = new RomanNumerals();
        int number = 17;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XVII");
    }

    @Test
    public void shouldGiveXVIII_whenGivenEighteen() {
        var romanNumerals = new RomanNumerals();
        int number = 18;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XVIII");
    }

    @Test
    public void shouldGiveXIX_whenGivenNineteen() {
        var romanNumerals = new RomanNumerals();
        int number = 19;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XIX");
    }

    @Test
    public void shouldGiveXX_whenGivenTwenty() {
        var romanNumerals = new RomanNumerals();
        int number = 20;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XX");
    }

    @Test
    public void shouldGiveXXI_whenGivenTwentyOne() {
        var romanNumerals = new RomanNumerals();
        int number = 21;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXI");
    }

    @Test
    public void shouldGiveXXII_whenGivenTwentyTwo() {
        var romanNumerals = new RomanNumerals();
        int number = 22;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXII");
    }

    @Test
    public void shouldGiveXXIII_whenGivenTwentyThree() {
        var romanNumerals = new RomanNumerals();
        int number = 23;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXIII");
    }

    @Test
    public void shouldGiveXXIV_whenGivenTwentyFour() {
        var romanNumerals = new RomanNumerals();
        int number = 24;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXIV");
    }

    @Test
    public void shouldGiveXXV_whenGivenTwentyFive() {
        var romanNumerals = new RomanNumerals();
        int number = 25;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXV");
    }

    @Test
    public void shouldGiveXXVI_whenGivenTwentySix() {
        var romanNumerals = new RomanNumerals();
        int number = 26;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXVI");
    }

    @Test
    public void shouldGiveXXVII_whenGivenTwentySeven() {
        var romanNumerals = new RomanNumerals();
        int number = 27;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXVII");
    }

    @Test
    public void shouldGiveXXVIII_whenGivenTwentyEight() {
        var romanNumerals = new RomanNumerals();
        int number = 28;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXVIII");
    }

    @Test
    public void shouldGiveXXIX_whenGivenTwentyNine() {
        var romanNumerals = new RomanNumerals();
        int number = 29;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXIX");
    }

    @Test
    public void shouldGiveXXX_whenGivenThirty() {
        var romanNumerals = new RomanNumerals();
        int number = 30;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXX");
    }

    @Test
    public void shouldGiveXXXI_whenGivenThirtyOne() {
        var romanNumerals = new RomanNumerals();
        int number = 31;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XXXI");
    }

    @Test
    public void shouldGiveL_whenGivenFifty() {
        var romanNumerals = new RomanNumerals();
        int number = 50;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("L");
    }

    @Test
    public void shouldGiveXL_whenGivenForty() {
        var romanNumerals = new RomanNumerals();
        int number = 40;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XL");
    }

    @Test
    public void shouldGiveXLI_whenGivenFortyOne() {
        var romanNumerals = new RomanNumerals();
        int number = 41;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XLI");
    }

    @Test
    public void shouldGiveXC_whenGivenNinety() {
        var romanNumerals = new RomanNumerals();
        int number = 90;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XC");
    }

    @Test
    public void shouldGiveXCI_whenGivenNinetyOne() {
        var romanNumerals = new RomanNumerals();
        int number = 91;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCI");
    }

    @Test
    public void shouldGiveXCII_whenGivenNinetyTwo() {
        var romanNumerals = new RomanNumerals();
        int number = 92;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCII");
    }

    @Test
    public void shouldGiveXCIII_whenGivenNinetyThree() {
        var romanNumerals = new RomanNumerals();
        int number = 93;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCIII");
    }

    @Test
    public void shouldGiveXCIV_whenGivenNinetyFour() {
        var romanNumerals = new RomanNumerals();
        int number = 94;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCIV");
    }

    @Test
    public void shouldGiveXCV_whenGivenNinetyFive() {
        var romanNumerals = new RomanNumerals();
        int number = 95;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCV");
    }

    @Test
    public void shouldGiveXCVI_whenGivenNinetySix() {
        var romanNumerals = new RomanNumerals();
        int number = 96;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCVI");
    }

    @Test
    public void shouldGiveXCVII_whenGivenNinetySeven() {
        var romanNumerals = new RomanNumerals();
        int number = 97;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCVII");
    }

    @Test
    public void shouldGiveXCVIII_whenGivenNinetyEight() {
        var romanNumerals = new RomanNumerals();
        int number = 98;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCVIII");
    }

    @Test
    public void shouldGiveXCIX_whenGivenNinetyNine() {
        var romanNumerals = new RomanNumerals();
        int number = 99;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("XCIX");
    }

    @Test
    public void shouldGiveC_whenGivenOneHundred() {
        var romanNumerals = new RomanNumerals();
        int number = 100;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("C");
    }

    @Test
    public void shouldGiveCI_whenGivenOneHundredOne() {
        var romanNumerals = new RomanNumerals();
        int number = 101;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("CI");
    }

    @Test
    public void shouldGiveCD_whenGivenFourHundred() {
        var romanNumerals = new RomanNumerals();
        int number = 400;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("CD");
    }

    @Test
    public void shouldGiveCDI_whenGivenFourHundredOne() {
        var romanNumerals = new RomanNumerals();
        int number = 401;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("CDI");
    }

    @Test
    public void shouldGiveCDX_whenGivenFourHundredTen() {
        var romanNumerals = new RomanNumerals();
        int number = 410;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("CDX");
    }

    @Test
    public void shouldGiveCDXL_whenGivenFourHundredForty() {
        var romanNumerals = new RomanNumerals();
        int number = 440;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("CDXL");
    }

    @Test
    public void shouldGiveM_whenGivenOneThousand() {
        var romanNumerals = new RomanNumerals();
        int number = 1000;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("M");
    }

    @Test
    public void shouldGiveMXXV_whenGivenOneThousandTwentyFive() {
        var romanNumerals = new RomanNumerals();
        int number = 1025;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("MXXV");
    }

    @Test
    public void shouldGiveMXLV_whenGivenOneThousandFortyFive() {
        var romanNumerals = new RomanNumerals();
        int number = 1045;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("MXLV");
    }

    @Test
    public void shouldGiveMCMXCIX_whenGivenOneThousandNineHundredNinetyNine() {
        var romanNumerals = new RomanNumerals();
        int number = 1999;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("MCMXCIX");
    }

    @Test
    public void shouldGiveMM_whenGivenTwoThousand() {
        var romanNumerals = new RomanNumerals();
        int number = 2000;
        assertThat(romanNumerals.convertToRoman(number)).isEqualTo("MM");
    }
}