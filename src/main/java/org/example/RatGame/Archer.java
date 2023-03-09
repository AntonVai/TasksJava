package org.example.RatGame;


import org.example.RatGame.Weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {
    private final Dog dog;

    public Archer(String name, int damage) {
        super(name, damage, 0);
        this.dog = new Dog("NRV", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " стрельнул из лука в " + enemy.getName());
        dog.attackEnemy(enemy);
    }

    @Override
    public void healRat(Enemy enemy) {

    }

    private class Dog {
        private final String name;
        private final int damage;

        public Dog(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " и " + Archer.this.getName() + " наносит совместный урон");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }

}
