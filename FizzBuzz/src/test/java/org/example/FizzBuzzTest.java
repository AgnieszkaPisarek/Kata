package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {
    @Test
    void shouldPrintOne_whenNumberIsOne() {
        final var FizzBuzz = new FizzBuzz();
        int number = 1;
        assertThat(FizzBuzz.compute(number)).isEqualTo("1");
    }

    @Test
    void shouldPrintTwo_whenNumberIsTwo() {
        final var FizzBuzz = new FizzBuzz();
        int number = 2;
        assertThat(FizzBuzz.compute(number)).isEqualTo("2");
    }

    @Test
    void shouldPrintFizz_whenNumberIsThree() {
        final var FizzBuzz = new FizzBuzz();
        int number = 3;
        assertThat(FizzBuzz.compute(number)).isEqualTo("Fizz");
    }

    @Test
    void shouldPrintBuzz_whenNumberIsFive() {
        final var FizzBuzz = new FizzBuzz();
        int number = 5;
        assertThat(FizzBuzz.compute(number)).isEqualTo("Buzz");
    }

    @Test
    void shouldPrintFizz_whenNumberIsNine() {
        final var FizzBuzz = new FizzBuzz();
        int number = 9;
        assertThat(FizzBuzz.compute(number)).isEqualTo("Fizz");
    }

    @Test
    void shouldPrintBuzz_whenNumberIsTen() {
        final var FizzBuzz = new FizzBuzz();
        int number = 10;
        assertThat(FizzBuzz.compute(number)).isEqualTo("Buzz");
    }

    @Test
    void shouldPrintFizzBuzz_whenNumberIsFifteen() {
        final var FizzBuzz = new FizzBuzz();
        int number = 15;
        assertThat(FizzBuzz.compute(number)).isEqualTo("FizzBuzz");
    }

//    @Test
//    void shouldPrintCorrectWord_whenNumberIsGiven() {
//        final var FizzBuzz = new FizzBuzz();
//        FizzBuzz.print();
//    }
//
//    @Test
//    void shouldPrintFizz_whenNumberIsThirteen() {
//        final var FizzBuzz = new FizzBuzz();
//        int number = 13;
//        assertThat(FizzBuzz.compute(number)).isEqualTo("Fizz");
//    }
//
//    @Test
//    void shouldPrintBuzz_whenNumberIsFiftyTwo() {
//        final var FizzBuzz = new FizzBuzz();
//        int number = 52;
//        assertThat(FizzBuzz.compute(number)).isEqualTo("Buzz");
//    }
//
//    @Test
//    void shouldPrintFizzBuzz_whenNumberIsFiftyThree() {
//        final var FizzBuzz = new FizzBuzz();
//        int number = 53;
//        assertThat(FizzBuzz.compute(number)).isEqualTo("FizzBuzz");
//    }
//
//    @Test
//    void shouldPrintFizzBuzzBuzz_whenNumberIsThirtyFive() {
//        final var FizzBuzz = new FizzBuzz();
//        int number = 35;
//        assertThat(FizzBuzz.compute(number)).isEqualTo("FizzBuzzBuzz");
//    }

}