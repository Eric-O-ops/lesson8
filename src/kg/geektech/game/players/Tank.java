package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;

public class Tank extends Hero {
    public Tank(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.ABSORB_DAMAGE, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int absorbDamage =(boss.getDamage() / 5);
        for (int i = 0; i < heroes.length; i++) {

            if (heroes[i].getHealth() > 0 ) {
                heroes[i].setHealth(heroes[i].getHealth() + absorbDamage);
                this.setHealth(this.getHealth() - absorbDamage);

            }

        }
    }
}
