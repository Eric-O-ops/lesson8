package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;

public class Berserk extends Hero {


    public Berserk(int health, int damage, String nameHero ) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_REVERT,nameHero );
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        boss.setHealth(boss.getHealth() - (boss.getDamage() / 2));


    }
}
