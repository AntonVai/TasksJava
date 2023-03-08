package org.example.decorator.PizzaDecorator;

public class pizzaWishSausages extends PizzaDecorator{
    public pizzaWishSausages(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getingredients() {
        return super.getingredients() + "Sausages";
    }
}
