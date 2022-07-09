package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;
import kg.geektech.game.general.RPG_GAME;

public class Magic extends Hero {

    public Magic(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.BOOST, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int number = RPG_GAME.random.nextInt(5) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + number);

            }

        }
    }
}
