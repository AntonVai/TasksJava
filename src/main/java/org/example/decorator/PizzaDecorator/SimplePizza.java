package org.example.decorator.PizzaDecorator;

public class SimplePizza implements Pizza{
    @Override
    public double getCost() {
        return 4.5;
    }

    @Override
    public String getingredients() {
        return "Pizza";
    }
}
