package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.YOUR_LIFE_NECESSARY_THEN_MINE, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0) {
                hero.setHealth(this.getHealth());
                this.setHealth(0);
                System.out.println("Wither revive " + hero.getNameHero());
                break;

            }
        }

    }
}
