package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;

public class Avrora extends Hero {
    public Avrora(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.DISAPPEAR, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
