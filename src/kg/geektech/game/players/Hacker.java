package kg.geektech.game.players;

import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.game_entities.SuperAbility;
import kg.geektech.game.general.RPG_GAME;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String nameHero) {
        super(health, damage, SuperAbility.IT_IS_MINE, nameHero);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        int randomHP = RPG_GAME.random.nextInt(50) + 20;
        int randomHero = RPG_GAME.random.nextInt(heroes.length - 1);
        if (RPG_GAME.hackerPoint >= 2 && boss.getHealth() > randomHP) {
            boss.setHealth(boss.getHealth() - randomHP);
            if (heroes[randomHero].getHealth() > 0) {
                heroes[randomHero].setHealth(heroes[randomHero].getHealth() + randomHP);
                RPG_GAME.hackerPoint = 0;
                System.out.println("Hacker stole [" + randomHP + "] HP and gave it to " + heroes[randomHero].getNameHero());

            }
        }
    }
}
