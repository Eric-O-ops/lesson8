package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;
import kg.geektech.game.general.RPG_GAME;

public class Thor extends Hero {


    public Thor(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.STUN, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        RPG_GAME.stunBoss = RPG_GAME.random.nextBoolean();


    }
}
