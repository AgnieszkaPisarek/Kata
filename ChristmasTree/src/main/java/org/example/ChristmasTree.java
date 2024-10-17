package org.example;

import java.util.ArrayList;

public class ChristmasTree {

    public ArrayList<String> draw(int height)    {

        ArrayList<String> tree = new ArrayList<>();
        StringBuilder level;

        int spaces = height - 1;
        int signs  = 1;


        for (int i = 0; i < height; i++) {

            level = new StringBuilder();

            level.append(" ".repeat(spaces));
            level.append("X".repeat(signs));
            level.append(" ".repeat(spaces));

            signs += 2;
            spaces--;

            tree.add(level.toString());
        }

        String lastLevel = tree.getFirst();
        tree.add(lastLevel.replaceFirst("X", "|"));

        return tree;
    }
}
