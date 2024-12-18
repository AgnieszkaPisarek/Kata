package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumeralTest {
    @Test
    public void shouldGiveI_whenGivenOne()  {
        var RomanNumeral = new RomanNumeral();
        int number = 1;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("I");
    }

    @Test
    public void shouldGiveII_whenGivenTwo()  {
        var RomanNumeral = new RomanNumeral();
        int number = 2;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("II");
    }

    @Test
    public void shouldGiveIV_whenGivenFour()  {
        var RomanNumeral = new RomanNumeral();
        int number = 4;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("IV");
    }

    @Test
    public void shouldGiveV_whenGivenFive()  {
        var RomanNumeral = new RomanNumeral();
        int number = 5;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("V");
    }

    @Test
    public void shouldGiveVI_whenGivenSix()  {
        var RomanNumeral = new RomanNumeral();
        int number = 6;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("VI");
    }

    @Test
    public void shouldGiveVII_whenGivenSeven()  {
        var RomanNumeral = new RomanNumeral();
        int number = 7;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("VII");
    }

    @Test
    public void shouldGiveIX_whenGivenNine()  {
        var RomanNumeral = new RomanNumeral();
        int number = 9;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("IX");
    }

    @Test
    public void shouldGiveX_whenGivenTen()  {
        var RomanNumeral = new RomanNumeral();
        int number = 10;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("X");
    }

    @Test
    public void shouldGiveXI_whenGivenEleven()  {
        var RomanNumeral = new RomanNumeral();
        int number = 11;
        assertThat(RomanNumeral.convertToRoman(number)).isEqualTo("XI");
    }

    @Test
    public void shouldGiveXIV_whenGivenFourteen() {
        var romanNumeral = new RomanNumeral();
        int number = 14;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XIV");
    }

    @Test
    public void shouldGiveXV_whenGivenFifteen() {
        var romanNumeral = new RomanNumeral();
        int number = 15;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XV");
    }

    @Test
    public void shouldGiveXVI_whenGivenSixteen() {
        var romanNumeral = new RomanNumeral();
        int number = 16;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XVI");
    }

    @Test
    public void shouldGiveXIX_whenGivenNineteen() {
        var romanNumeral = new RomanNumeral();
        int number = 19;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XIX");
    }

    @Test
    public void shouldGiveXX_whenGivenTwenty() {
        var romanNumeral = new RomanNumeral();
        int number = 20;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XX");
    }

    @Test
    public void shouldGiveXXI_whenGivenTwentyOne() {
        var romanNumeral = new RomanNumeral();
        int number = 21;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XXI");
    }

    @Test
    public void shouldGiveXXIV_whenGivenTwentyFour() {
        var romanNumeral = new RomanNumeral();
        int number = 24;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XXIV");
    }

    @Test
    public void shouldGiveXXV_whenGivenTwentyFive() {
        var romanNumeral = new RomanNumeral();
        int number = 25;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XXV");
    }

    @Test
    public void shouldGiveXXVI_whenGivenTwentySix() {
        var romanNumeral = new RomanNumeral();
        int number = 26;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XXVI");
    }

    @Test
    public void shouldGiveL_whenGivenFifty() {
        var romanNumeral = new RomanNumeral();
        int number = 50;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("L");
    }

    @Test
    public void shouldGiveXL_whenGivenForty() {
        var romanNumeral = new RomanNumeral();
        int number = 40;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XL");
    }

    @Test
    public void shouldGiveXLI_whenGivenFortyOne() {
        var romanNumeral = new RomanNumeral();
        int number = 41;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XLI");
    }

    @Test
    public void shouldGiveXC_whenGivenNinety() {
        var romanNumeral = new RomanNumeral();
        int number = 90;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XC");
    }

    @Test
    public void shouldGiveXCI_whenGivenNinetyOne() {
        var romanNumeral = new RomanNumeral();
        int number = 91;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("XCI");
    }

    @Test
    public void shouldGiveC_whenGivenOneHundred() {
        var romanNumeral = new RomanNumeral();
        int number = 100;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("C");
    }

    @Test
    public void shouldGiveCI_whenGivenOneHundredOne() {
        var romanNumeral = new RomanNumeral();
        int number = 101;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("CI");
    }

    @Test
    public void shouldGiveCD_whenGivenFourHundred() {
        var romanNumeral = new RomanNumeral();
        int number = 400;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("CD");
    }

    @Test
    public void shouldGiveCDI_whenGivenFourHundredOne() {
        var romanNumeral = new RomanNumeral();
        int number = 401;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("CDI");
    }

    @Test
    public void shouldGiveCDX_whenGivenFourHundredTen() {
        var romanNumeral = new RomanNumeral();
        int number = 410;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("CDX");
    }

    @Test
    public void shouldGiveCDXL_whenGivenFourHundredForty() {
        var romanNumeral = new RomanNumeral();
        int number = 440;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("CDXL");
    }

    @Test
    public void shouldGiveM_whenGivenOneThousand() {
        var romanNumeral = new RomanNumeral();
        int number = 1000;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("M");
    }

    @Test
    public void shouldGiveMXXV_whenGivenOneThousandTwentyFive() {
        var romanNumeral = new RomanNumeral();
        int number = 1025;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("MXXV");
    }

    @Test
    public void shouldGiveMCMXCIX_whenGivenOneThousandNineHundredNinetyNine() {
        var romanNumeral = new RomanNumeral();
        int number = 1999;
        assertThat(romanNumeral.convertToRoman(number)).isEqualTo("MCMXCIX");
    }
}