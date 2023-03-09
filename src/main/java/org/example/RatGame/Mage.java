package org.example.RatGame;


import org.example.RatGame.Weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T>{
    public Mage(String name, int damage) {
        super(name, damage,0);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " кастует нову в " + enemy.getName());
        enemy.takeDamage(getDamage());
    }

    @Override
    public void healRat(Enemy enemy) {

    }
}
