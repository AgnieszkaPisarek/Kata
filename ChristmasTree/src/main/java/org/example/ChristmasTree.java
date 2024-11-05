package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTree {
    public static final int NUMBER_OF_NEW_BRANCHES_PER_LEVEL = 2;
    public static String SPACES = " ";
    public static String ROOT = "|";
    public static String BRANCH = "X";

    public List<String> makeATree(int height)    {
        List<String> tree = new ArrayList<>();
        StringBuilder level;

        int numberOfSpacesPerLevel = height - 1;
        int numberOfBranchesPerLevel  = 1;

        for (int i = 0; i < height; i++) {
            level = new StringBuilder();

            level.append(repeatSymbol(SPACES, numberOfSpacesPerLevel));
            level.append(repeatSymbol(BRANCH, numberOfBranchesPerLevel));
            level.append(repeatSymbol(SPACES, numberOfSpacesPerLevel));

            numberOfBranchesPerLevel += NUMBER_OF_NEW_BRANCHES_PER_LEVEL;
            numberOfSpacesPerLevel--;

            tree.add(level.toString());
        }

        tree.add(getRootFromTreeWithSameMargin(tree));

        return tree;
    }

    private static String getRootFromTreeWithSameMargin(List<String> tree) {
        String peak = tree.getFirst();
        return peak.replaceFirst(BRANCH, ROOT);
    }

    String repeatSymbol(String symbol, int numberOfRepetitions)   {
        return symbol.repeat(numberOfRepetitions);
    }

}
