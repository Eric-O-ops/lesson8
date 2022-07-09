package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;
import kg.geektech.game.general.RPG_GAME;

public class Druid extends Hero {
    public Druid(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.CLONE_OR_HENCHMEN, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {


    }
}