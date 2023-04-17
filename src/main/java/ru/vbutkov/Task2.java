package ru.vbutkov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static final int LIST_SIZE = 1_000_000;
    public static final int COUNT_ITER = 1000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList = fillList(arrayList);

        LinkedList<Integer> linkedList = fillLinkedList(arrayList);

        System.out.println("Arraylist: " + elapsedTime(arrayList));
        System.out.println("Linkedlist: " + elapsedTime(linkedList));
    }

    private static long elapsedTime(List<Integer> testList) {
        long startTime = System.nanoTime();
        getElements(testList);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    private static void getElements(List<Integer> testList) {
        for (int i = 0; i < COUNT_ITER; i++) {
            int rndIndex = getRandom();
            testList.get(rndIndex);
        }
    }

    private static ArrayList<Integer> fillList(ArrayList<Integer> arrayList) {
        for (int i = 0; i < LIST_SIZE; i++) {
            arrayList.add(getRandom());
        }
        return arrayList;
    }

    private static LinkedList<Integer> fillLinkedList(ArrayList<Integer> arrayList) {
        return new LinkedList<>(arrayList);
    }

    private static int getRandom() {
        return new Random().nextInt(LIST_SIZE);
    }


}
