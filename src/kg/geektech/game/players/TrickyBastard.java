package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;
import kg.geektech.game.general.RPG_GAME;

public class TrickyBastard extends Hero {
    public TrickyBastard(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.BOSS_THINK_U_DIED, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
