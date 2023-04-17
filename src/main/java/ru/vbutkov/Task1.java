package ru.vbutkov;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> colors = new HashMap<>();
        colors = fillMap(colors);
        System.out.println(colors);

        HashMap<String, Integer> swapKeyAndValueInColors = swapKeyAndValueInMap(colors);
        System.out.println(swapKeyAndValueInColors);
    }

    private static HashMap<Integer, String> fillMap(HashMap<Integer, String> colors) {
        colors.put(1, "red");
        colors.put(2, "green");
        colors.put(3, "black");
        colors.put(4, "blue");

        return colors;
    }

    private static HashMap<String, Integer> swapKeyAndValueInMap(HashMap<Integer, String> colors) {
        HashMap<String, Integer> swapKeyAndValueInColors = new HashMap<>();
        for (Map.Entry<Integer, String> entrie : colors.entrySet()) {
            swapKeyAndValueInColors.put(entrie.getValue(), entrie.getKey());
        }

        return swapKeyAndValueInColors;
    }
}