package ru.geekbrains.Java_3;

import java.util.ArrayList;

public class FruitBox <E extends Fruits>{
    private ArrayList <E> fruitBox = new ArrayList();

    public ArrayList<E> getFruitBox() {
        return fruitBox;
    }

    public FruitBox() {
    }

    public void addFruit(E fruit, int iter){
        for (int i = 0; i <iter; i++) {
            fruitBox.add(fruit);
        }
    }
    public float getWeight(){
        float weight = 0;
        for (E box : fruitBox) {
            weight += box.getWeight();
        }
        return weight;
    }
    public <E> void compare (FruitBox<?> another) {
        System.out.println(Math.abs(this.getWeight() - another.getWeight()) < 0.00001);
    }

    public void moveToAnotherBox(FruitBox <E> another){
        another.fruitBox.addAll(this.fruitBox);
        this.fruitBox.clear();
    }

}
