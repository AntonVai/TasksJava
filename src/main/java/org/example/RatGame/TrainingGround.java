package org.example.RatGame;


import org.example.RatGame.Weapon.MagicWeapon;
import org.example.RatGame.Weapon.MeleeWeapon;
import org.example.RatGame.Weapon.RangeWeapon;

public class TrainingGround {
    public static void main(String[] args) {
        Hero<MagicWeapon> mage = new Mage<>("Xerus", 20);
        Hero<MeleeWeapon> warrior = new Warrior<>("FloydMazer", 40);
        Hero<RangeWeapon> archer = new Archer<>("T1mmy", 30);
        Hero<?> donater = new Donater("Друльчик", 0, 50);
        Enemy enemy = new Enemy("Крысинную морду по имени Хаммер", 100);
        attackEnemy(enemy, mage, archer, warrior);
        donater.healRat(enemy);

    }
    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
