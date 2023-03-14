package org.example.generics.example1;

public class Animal {
    public Animal() {
    }

    private int id;
    public Animal(int id) {
        this.id = id;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
