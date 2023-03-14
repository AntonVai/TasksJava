package org.example.generics.example2;

public class GenDemo {
    public static void main(String[] args) {
        ThreeGen<String,String,Integer> test = new ThreeGen<>("Петя","Петров",25);
        test.show();

    }
}
