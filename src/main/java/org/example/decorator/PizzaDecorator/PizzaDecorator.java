package org.example.decorator.PizzaDecorator;

public  abstract class PizzaDecorator implements Pizza{
    private final Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public String getingredients() {
        return pizza.getingredients();
    }
}
