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

            level.append(draw(SPACES, numberOfSpacesPerLevel));
            level.append(draw(BRANCH, numberOfBranchesPerLevel));
            level.append(draw(SPACES, numberOfSpacesPerLevel));

            numberOfBranchesPerLevel += NUMBER_OF_NEW_BRANCHES_PER_LEVEL;
            numberOfSpacesPerLevel--;

            tree.add(level.toString());
        }

        addRoot(tree);

        return tree;
    }

    private static void addRoot(List<String> tree) {
        String lastLevel = tree.getFirst();
        tree.add(lastLevel.replaceFirst(BRANCH, ROOT));
    }

    StringBuilder draw(String sign, int numberOfSignsPerLevel)   {
        return new StringBuilder().append(sign.repeat(numberOfSignsPerLevel));
    }

}
