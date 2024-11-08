package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


class AirportTest {

    @Test
    public void example() {
        // CAT => DOG
        String[] before = new String[]{"CAT"};
        int[][] rotors = new int[][]{{1,13,27}};
        String[] after = Airport.flapDisplay(before,rotors);
        String[] expected = new String[]{"DOG"};
        assertArrayEquals(expected, after);
    }

    @Test
    public void basic() {
        // HELLO => WORLD!
        String[] before = new String[]{"HELLO "};
        int[][] rotors = new int[][]{{15, 49, 50, 48, 43, 13}};
        String[] after = Airport.flapDisplay(before, rotors);
        String[] expected = new String[]{"WORLD!"};
        assertArrayEquals(expected, after);

        // CODE => WARS
        String[] before2 = new String[]{"CODE"};
        int[][] rotors2 = new int[][]{{20,20,28,0}};
        String[] after2 = Airport.flapDisplay(before2,rotors2);
        String[] expected2 = new String[]{"WARS"};
        assertArrayEquals(expected2, after2);
    }

    @Test
    public void changeEveryLetter() {
        String[] before = new String[]{"AGA"};
        int[][] rotors = new int[][]{{1, 0, 0}};
        String[] after = new String[]{"BHB"};
        assertArrayEquals(after, Airport.flapDisplay(before,rotors));
    }

    @Test
    public void changeEveryLetterManyTimes() {
        String[] before = new String[]{"AGA"};
        int[][] rotors = new int[][]{{1, 1, 1}};
        String[] after = new String[]{"BID"};
        assertArrayEquals(after, Airport.flapDisplay(before,rotors));
    }

    @Test
    public void changeEveryLetter_whenIndexGoesOutOfBoundsOfTheAlphabet() {
        String[] before = new String[]{"AGA"};
        int[][] rotors = new int[][]{{1, 53, 1}};
        String[] after = new String[]{"BGB"};
        assertArrayEquals(after, Airport.flapDisplay(before,rotors));
    }

    @Test
    public void changeManyWords() {
        String[] before = new String[]{"HELLO ", "CODE"};
        int[][] rotors = new int[][]{{15, 49, 50, 48, 43, 13}, {20,20,28,0}};
        String[] after = Airport.flapDisplay(before, rotors);
        String[] expected = new String[]{"WORLD!", "WARS"};
        assertArrayEquals(expected, after);
    }

}