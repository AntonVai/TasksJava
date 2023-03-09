package org.example.RatGame;


import org.example.RatGame.Weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon>  extends  Hero<T>{
    public Warrior(String name, int damage) {
        super(name, damage,0);

    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " пытается добить топором " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

    @Override
    public void healRat(Enemy enemy) {

    }
}
