package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ChristmasTreeTest {
    @Test
    void shouldReturnOneLevelTree_whenGivenOne() {

        final var christmasTree = new RomanNumeral();
        ArrayList<String> tree;
        tree = christmasTree.draw(1);

        assertAll(
                () -> assertThat(tree.getFirst()).isEqualTo("X"),
                () -> assertThat(tree.getLast()).isEqualTo("|")
        );
    }

    @Test
    void shouldReturnTwoLevelTree_whenGivenTwo() {

        final var christmasTree = new RomanNumeral();
        ArrayList<String> tree;
        tree = christmasTree.draw(2);

        assertAll(
                () -> assertThat(tree.getFirst()).isEqualTo(" X "),
                () -> assertThat(tree.get(1)).isEqualTo("XXX"),
                () -> assertThat(tree.getLast()).isEqualTo(" | ")
        );
    }

    @Test
    void shouldReturnThreeLevelTree_whenGivenThree() {

        final var christmasTree = new RomanNumeral();
        ArrayList<String> tree;
        tree = christmasTree.draw(3);

        assertAll(
                () -> assertThat(tree.getFirst()).isEqualTo("  X  "),
                () -> assertThat(tree.get(1)).isEqualTo(" XXX "),
                () -> assertThat(tree.get(2)).isEqualTo("XXXXX"),
                () -> assertThat(tree.getLast()).isEqualTo("  |  ")
        );
    }

}