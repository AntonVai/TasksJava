package org.example.decorator;


import org.example.decorator.PizzaDecorator.Pizza;
import org.example.decorator.PizzaDecorator.PizzaWithMushrooms;
import org.example.decorator.PizzaDecorator.SimplePizza;
import org.example.decorator.PizzaDecorator.pizzaWishSausages;
import org.example.decorator.devDecorator.Developer;
import org.example.decorator.devDecorator.JavaDeveloper;
import org.example.decorator.devDecorator.SeniorJavaDeveloper;
import org.example.decorator.devDecorator.TeamLeadJavaDeveloper;

public class Runner {
    public static void main(String[] args) {
        Developer developer = new TeamLeadJavaDeveloper(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
        System.out.println("-----------------------------------------------------------");

        Pizza simplePizza = new SimplePizza();
        System.out.printf("Ingredients: %s %nCost: $%.2f", simplePizza.getingredients(), simplePizza.getCost());

        Pizza pizzawithMushrooms = new PizzaWithMushrooms(new SimplePizza());
        System.out.printf("%nIngredients: %s %nCost: $%.2f", pizzawithMushrooms.getingredients(), pizzawithMushrooms.getCost());
        Pizza pizzawithSausages = new pizzaWishSausages(new SimplePizza());
        System.out.printf("%nIngredients: %s %nCost: $%.2f", pizzawithSausages.getingredients(), pizzawithSausages.getCost());


    }
}
