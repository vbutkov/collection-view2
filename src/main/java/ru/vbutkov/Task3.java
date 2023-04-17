package ru.vbutkov;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames = fillList(listOfNames);
        System.out.println(listOfNames);
        ArrayList<String> listOfUniqNames = deleteDublicates(listOfNames);
        System.out.println(listOfUniqNames);

    }

    private static ArrayList<String> deleteDublicates(ArrayList<String> listOfNames) {
        Set<String> uniqNames = new HashSet<>(listOfNames);
        return new ArrayList<>(uniqNames);
    }

    private static ArrayList<String> fillList(ArrayList<String> list) {
        String[] rndNames = {"Masha", "Natasha", "Vladimir", "Ira"};
        for (int i = 0; i < 10; i++) {
            list.add(rndNames[new Random().nextInt(rndNames.length)]);
        }
        return list;
    }
}
