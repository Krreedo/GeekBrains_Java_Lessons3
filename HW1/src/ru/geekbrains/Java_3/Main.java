package ru.geekbrains.Java_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1ое задание
        String[] stringArr = {"1", "2", "3", "4", "5"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        swapIndex(stringArr, 1, 3);
        swapIndex(intArr, 1, 4);

        // 2ое задание
        List<?> stringArrAsList = modifyToArrayList(stringArr);
        System.out.println(stringArrAsList);

        // 3е задание
        FruitBox<Orange> orangeFruitBox = new FruitBox<>();
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        appleFruitBox.addFruit(new Apple(),15);
        orangeFruitBox.addFruit(new Orange(),10);
        float a = appleFruitBox.getWeight();
        System.out.println(a);
        appleFruitBox.compare(orangeFruitBox);
        FruitBox<Apple> appleFruitBox1 = new FruitBox<>();
        appleFruitBox1.addFruit(new Apple(),5);
        appleFruitBox.moveToAnotherBox(appleFruitBox1);
        a = appleFruitBox1.getWeight();
        float c = appleFruitBox.getWeight();
        System.out.println(c);
        System.out.println(a);


    }

    public static <T> List<T> modifyToArrayList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }

    public static <T> void swapIndex(T[] arr, int i, int j) {
        T cache = arr[i];
        arr[i] = arr[j];
        arr[j] = cache;
        System.out.println(Arrays.toString(arr));

    }
}
