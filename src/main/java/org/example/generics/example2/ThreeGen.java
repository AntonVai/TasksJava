package org.example.generics.example2;
/**
 *1. Создать обобщенный класс с тремя параметрами.
 *2. Класс содержит три перменные типа.
 *3. Класс содержит конструктор, принимающий на взод параметры типа.
 *4. Класс содержит методы возвращающие значения трех переменных.
 *5. Создать метод, выводящий на консоль имена классов для трех переменных класса.
 */


public class ThreeGen<T,V,K> {
    private T t;
    private V v;
    private K k;

    public ThreeGen(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public  void show(){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("K: " + k.getClass().getName());
        System.out.println("V: " + v.getClass().getName());

    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
