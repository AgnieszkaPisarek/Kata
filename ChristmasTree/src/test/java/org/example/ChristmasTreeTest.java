package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ChristmasTreeTest {
    @Test
    void shouldReturnOneLevelTree_whenGivenOne() {

        final var christmasTree = new ChristmasTree();
        List<String> tree;
        tree = christmasTree.makeATree(1);
        List<String> expectedTree = List.of(
                "X",
                "|"
        );

        assertThat(tree).isEqualTo(expectedTree);
    }

    @Test
    void shouldReturnTwoLevelTree_whenGivenTwo() {

        final var christmasTree = new ChristmasTree();
        List<String> tree;
        tree = christmasTree.makeATree(2);

        assertAll(
                () -> assertThat(tree.getFirst()).isEqualTo(" X "),
                () -> assertThat(tree.get(1)).isEqualTo("XXX"),
                () -> assertThat(tree.getLast()).isEqualTo(" | ")
        );
    }

    @Test
    void shouldReturnThreeLevelTree_whenGivenThree() {

        final var christmasTree = new ChristmasTree();
        List<String> tree;
        tree = christmasTree.makeATree(3);

        assertAll(
                () -> assertThat(tree.getFirst()).isEqualTo("  X  "),
                () -> assertThat(tree.get(1)).isEqualTo(" XXX "),
                () -> assertThat(tree.get(2)).isEqualTo("XXXXX"),
                () -> assertThat(tree.getLast()).isEqualTo("  |  ")
        );
    }

}