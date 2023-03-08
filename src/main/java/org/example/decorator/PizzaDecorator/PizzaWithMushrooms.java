package org.example.decorator.PizzaDecorator;

public class PizzaWithMushrooms extends PizzaDecorator{


    public PizzaWithMushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getingredients() {
        return super.getingredients() + "Mushrooms";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
