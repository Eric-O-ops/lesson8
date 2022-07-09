package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;

public class Medic extends Hero {
    private int healthPoint;

    public Medic(int health, int damage, String nameHero, int healthPoint) {
        super(health, damage, SuperAbility.HEAlTH, nameHero);
        this.healthPoint = healthPoint;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] != this && heroes[i].getHealth() > 0 ) {
                heroes[i].setHealth( heroes[i].getHealth() + this.healthPoint);
            }

        }
    }
}
