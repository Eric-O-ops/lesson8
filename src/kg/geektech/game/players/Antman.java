package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;

public class Antman extends Hero {
    public Antman(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.BECOME_BIGGER, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
