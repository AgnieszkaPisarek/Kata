package org.example;


public class Airport {

    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
    private static final int NUMBER_OF_LETTERS = ALPHABET.length();

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
        String[] result = new String[lines.length];

        for (int i = 0; i < lines.length; i++) {
            char[] letters = lines[i].toCharArray();

            for (int j = 0; j < rotors[i].length; j++) {

                for(int z = j; z < letters.length; z++) {
                    letters[z] = rotateLetter(letters[z], rotors[i][j]);
                }
            }
            result[i] = new String(letters);
        }

        return result;
    }

    private static char rotateLetter(char letter, int rotation)   {
        int index = getIndexAfterRotation(letter, rotation);
        if(isIndexOutOfBoundsOfTheAlphabet(index)) {
            index = getNewIndexAfterItGoesOutOfBoundsOfTheAlphabet(letter, rotation);
        }
        return ALPHABET.charAt(index);
    }

    private static int getIndexAfterRotation(char letter, int rotation) {
        return ALPHABET.indexOf(letter) + rotation;
    }

    private static boolean isIndexOutOfBoundsOfTheAlphabet(int index) {
        return index >= NUMBER_OF_LETTERS;
    }

    private static int getNewIndexAfterItGoesOutOfBoundsOfTheAlphabet(char letter, int rotation) {
        return ALPHABET.indexOf(letter) + rotation - NUMBER_OF_LETTERS;
    }
}
