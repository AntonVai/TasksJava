package org.example.RatGame;


import org.example.RatGame.Weapon.Weapon;

public abstract class Hero<T extends Weapon> {
    private int heal;
    private final String name;
    private int damage;
    private  T weapon;



    public Hero(String name, int damage, int heal) {
        this.name = name;
        this.damage = damage;
        this.heal = heal;
    }

    public abstract void attackEnemy(Enemy enemy) ;



    public abstract void healRat(Enemy enemy) ;


    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeal() {
        return heal;
    }

    public int setHeal(int heal) {
        this.heal = heal;
        return heal;
    }

    public String getName() {
        return name;
    }
}
