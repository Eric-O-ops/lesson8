package kg.geektech.game.game_entities;

import kg.geektech.game.players.Boss;

public abstract class Hero extends GameEntity implements HavingSuperAbility{
    private SuperAbility superAbility;
    private String nameHero;

    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

    public Hero(int health, int damage, SuperAbility superAbility, String nameHero) {
        super(health, damage);
        this.superAbility = superAbility;
        this.nameHero = nameHero;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {

    }
}
