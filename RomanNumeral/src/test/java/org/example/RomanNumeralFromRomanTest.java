package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanNumeralFromRomanTest {
    @Test
    public void shouldGiveI_whenGivenOne()  {
        var romanNumeral = new RomanNumeral();
        int number = 1;
        assertThat(romanNumeral.convertFromRoman("I")).isEqualTo(number);
    }

    @Test
    public void shouldGiveII_whenGivenTwo()  {
        var romanNumeral = new RomanNumeral();
        int number = 2;
        assertThat(romanNumeral.convertFromRoman("II")).isEqualTo(number);
    }

    @Test
    public void shouldGiveIV_whenGivenFour()  {
        var romanNumeral = new RomanNumeral();
        int number = 4;
        assertThat(romanNumeral.convertFromRoman("IV")).isEqualTo(number);
    }

    @Test
    public void shouldGiveV_whenGivenFive()  {
        var romanNumeral = new RomanNumeral();
        int number = 5;
        assertThat(romanNumeral.convertFromRoman("V")).isEqualTo(number);
    }

    @Test
    public void shouldGiveVI_whenGivenSix()  {
        var romanNumeral = new RomanNumeral();
        int number = 6;
        assertThat(romanNumeral.convertFromRoman("VI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveVII_whenGivenSeven()  {
        var romanNumeral = new RomanNumeral();
        int number = 7;
        assertThat(romanNumeral.convertFromRoman("VII")).isEqualTo(number);
    }

    @Test
    public void shouldGiveIX_whenGivenNine()  {
        var romanNumeral = new RomanNumeral();
        int number = 9;
        assertThat(romanNumeral.convertFromRoman("IX")).isEqualTo(number);
    }

    @Test
    public void shouldGiveX_whenGivenTen()  {
        var romanNumeral = new RomanNumeral();
        int number = 10;
        assertThat(romanNumeral.convertFromRoman("X")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXI_whenGivenEleven()  {
        var romanNumeral = new RomanNumeral();
        int number = 11;
        assertThat(romanNumeral.convertFromRoman("XI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXIV_whenGivenFourteen() {
        var romanNumeral = new RomanNumeral();
        int number = 14;
        assertThat(romanNumeral.convertFromRoman("XIV")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXV_whenGivenFifteen() {
        var romanNumeral = new RomanNumeral();
        int number = 15;
        assertThat(romanNumeral.convertFromRoman("XV")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXVI_whenGivenSixteen() {
        var romanNumeral = new RomanNumeral();
        int number = 16;
        assertThat(romanNumeral.convertFromRoman("XVI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXIX_whenGivenNineteen() {
        var romanNumeral = new RomanNumeral();
        int number = 19;
        assertThat(romanNumeral.convertFromRoman("XIX")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXX_whenGivenTwenty() {
        var romanNumeral = new RomanNumeral();
        int number = 20;
        assertThat(romanNumeral.convertFromRoman("XX")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXXI_whenGivenTwentyOne() {
        var romanNumeral = new RomanNumeral();
        int number = 21;
        assertThat(romanNumeral.convertFromRoman("XXI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXXIV_whenGivenTwentyFour() {
        var romanNumeral = new RomanNumeral();
        int number = 24;
        assertThat(romanNumeral.convertFromRoman("XXIV")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXXV_whenGivenTwentyFive() {
        var romanNumeral = new RomanNumeral();
        int number = 25;
        assertThat(romanNumeral.convertFromRoman("XXV")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXXVI_whenGivenTwentySix() {
        var romanNumeral = new RomanNumeral();
        int number = 26;
        assertThat(romanNumeral.convertFromRoman("XXVI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveL_whenGivenFifty() {
        var romanNumeral = new RomanNumeral();
        int number = 50;
        assertThat(romanNumeral.convertFromRoman("L")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXL_whenGivenForty() {
        var romanNumeral = new RomanNumeral();
        int number = 40;
        assertThat(romanNumeral.convertFromRoman("XL")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXLI_whenGivenFortyOne() {
        var romanNumeral = new RomanNumeral();
        int number = 41;
        assertThat(romanNumeral.convertFromRoman("XLI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXC_whenGivenNinety() {
        var romanNumeral = new RomanNumeral();
        int number = 90;
        assertThat(romanNumeral.convertFromRoman("XC")).isEqualTo(number);
    }

    @Test
    public void shouldGiveXCI_whenGivenNinetyOne() {
        var romanNumeral = new RomanNumeral();
        int number = 91;
        assertThat(romanNumeral.convertFromRoman("XCI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveC_whenGivenOneHundred() {
        var romanNumeral = new RomanNumeral();
        int number = 100;
        assertThat(romanNumeral.convertFromRoman("C")).isEqualTo(number);
    }

    @Test
    public void shouldGiveCI_whenGivenOneHundredOne() {
        var romanNumeral = new RomanNumeral();
        int number = 101;
        assertThat(romanNumeral.convertFromRoman("CI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveCD_whenGivenFourHundred() {
        var romanNumeral = new RomanNumeral();
        int number = 400;
        assertThat(romanNumeral.convertFromRoman("CD")).isEqualTo(number);
    }

    @Test
    public void shouldGiveCDI_whenGivenFourHundredOne() {
        var romanNumeral = new RomanNumeral();
        int number = 401;
        assertThat(romanNumeral.convertFromRoman("CDI")).isEqualTo(number);
    }

    @Test
    public void shouldGiveCDX_whenGivenFourHundredTen() {
        var romanNumeral = new RomanNumeral();
        int number = 410;
        assertThat(romanNumeral.convertFromRoman("CDX")).isEqualTo(number);
    }

    @Test
    public void shouldGiveCDXL_whenGivenFourHundredForty() {
        var romanNumeral = new RomanNumeral();
        int number = 440;
        assertThat(romanNumeral.convertFromRoman("CDXL")).isEqualTo(number);
    }

    @Test
    public void shouldGiveM_whenGivenOneThousand() {
        var romanNumeral = new RomanNumeral();
        int number = 1000;
        assertThat(romanNumeral.convertFromRoman("M")).isEqualTo(number);
    }

    @Test
    public void shouldGiveMXXV_whenGivenOneThousandTwentyFive() {
        var romanNumeral = new RomanNumeral();
        int number = 1025;
        assertThat(romanNumeral.convertFromRoman("MXXV")).isEqualTo(number);
    }

    @Test
    public void shouldGiveMCMXCIX_whenGivenOneThousandNineHundredNinetyNine() {
        var romanNumeral = new RomanNumeral();
        int number = 1999;
        assertThat(romanNumeral.convertFromRoman("MCMXCIX")).isEqualTo(number);
    }
}