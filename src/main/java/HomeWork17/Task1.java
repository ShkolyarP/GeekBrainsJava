package HomeWork17;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        String[] array = {"a", "b", "c", "doo", "ffff", "ee"};
        swapInArray(array, 4, 5);
        System.out.println(Arrays.toString(array));

        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box1 = new Box<>();
        box1.addToBox(apple, 4);

        System.out.println(box1.getWeight());


    }

    private static void swapInArray(Object[] array, int n1, int n2) {
        Object change = array[n1];
        array[n1] = array[n2];
        array[n2] = change;
    }

    private static <T> ArrayList<T> transformArrayToArrayList(T[] array) {

        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));

        return list;
    }

}

