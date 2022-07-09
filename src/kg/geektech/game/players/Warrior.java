package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;
import kg.geektech.game.general.RPG_GAME;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int number = RPG_GAME.random.nextInt(4) + 2;
        int skillWarrior = (this.getDamage() * number);

        boss.setHealth((boss.getHealth() + this.getDamage()) - skillWarrior );
    }


}
