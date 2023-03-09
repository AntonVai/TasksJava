package org.example.RatGame;

public class Donater extends Hero  {


    public Donater(String name, int damage, int heal) {
        super(name, damage, heal);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
    }

    @Override
    public void healRat(Enemy enemy) {
        int hp = this.setHeal(getHeal() + enemy.getHealth());
        System.out.println(getName() + " донатит 50 рублей ");
        System.out.println(getName() + "  Воскрешает крысу, текущее хп " + hp);
    }
}
