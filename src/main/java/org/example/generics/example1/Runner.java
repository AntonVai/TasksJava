package org.example.generics.example1;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1));
        animalList.add(new Animal(2));

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(3));
        dogList.add(new Dog(4));
        test(animalList);
        System.out.println("--------");
        test(dogList);

    }
    private  static void test(List<? extends Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
