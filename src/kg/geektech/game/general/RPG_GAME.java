package kg.geektech.game.general;


import kg.geektech.game.game_entities.Hero;
import kg.geektech.game.players.*;
import java.util.Random;

public class RPG_GAME {

    private static int round_number;
    public static Random random = new Random();
    public static boolean stunBoss = false;
    public static int hackerPoint = 2;



    public static void start(){


        Boss boss = new Boss(1100, 50);

        Warrior warrior = new Warrior(270, 15, "Bob");
        Magic magic = new Magic(240, 20, "Stew");
        Berserk berserk = new Berserk(300,20, "Avangard");
        Medic doc = new Medic(190, 8, "Doc", 55);
        Medic assistant  = new Medic(250, 20, "Young Doc", 10);
        Thor thor = new Thor(200, 40, "Thor" );
        Tank tank = new Tank(400, 10, "Tank");
        Witcher witcher = new Witcher(300,0,"Wither");
        Hacker hacker = new Hacker(200, 12, "Hacker");
        TrickyBastard trickyBastard = new TrickyBastard(120,10,"Bastard");





        Hero[] heroes = {warrior, doc, magic, berserk, assistant, thor, tank, witcher, hacker};

        printStatistic(heroes, boss);

        while (!isGameFinish(heroes, boss)){
            round(heroes, boss);
        }

    }


    private  static void printStatistic(Hero[] heroes, Boss boss){
        if (round_number == 0) {
            System.out.println("STARTING STATISTIC");
        }
        else {
            System.out.println("ROUND - " + round_number + " -");
        }
        System.out.println("______________________________________________\n" +
                "Boss health: [" + boss.getHealth() + "] and damage: [" +
                boss.getDamage() + "]");
        for (Hero hero : heroes) {
            System.out.println(hero.getNameHero() + " health: [" + hero.getHealth() +
                    "] and  damage: [" + hero.getDamage() + "]");

        }
        System.out.println("______________________________________________");

    }


    private static void round(Hero[] heroes, Boss boss){
        round_number++;
        bossHeat(heroes, boss);
        heroesHeat(heroes, boss);
        applySuperPower(heroes, boss);
        printStatistic(heroes, boss);
        hackerPoint++;

    }

    private static boolean isGameFinish(Hero[] heroes, Boss boss){
        if (boss.getHealth() <= 0){
            System.out.println("HEROES WON");
            return true;
        }
        boolean allHeroesDied = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDied = false;
                break;
            }

        }
        if (allHeroesDied){
            System.out.println("BOSS WON");
        }

      return allHeroesDied;
    }

    public static void bossHeat(Hero[] heroes, Boss boss){
        if (!stunBoss) {
            for (Hero hero : heroes) {

                if (boss.getHealth() > 0 && hero.getHealth() > 0) {
                    if (hero.getHealth() < boss.getDamage()) {
                        hero.setHealth(0);

                    } else {
                        hero.setHealth(hero.getHealth() - boss.getDamage());
                    }

                }
            }
        }else {
            System.out.println("Boss was stunned by Thor");
            stunBoss = false;
        }


    }
    public static void heroesHeat(Hero[] heroes, Boss boss){
        for (Hero hero : heroes) {
            if (boss.getHealth() > 0 && hero.getHealth() > 0) {
                if (boss.getHealth() < hero.getDamage()) {
                    boss.setHealth(0);

                } else {
                    boss.setHealth(boss.getHealth() - hero.getDamage());
                }
            }

        }



    }
    public static void applySuperPower (Hero[] heroes, Boss boss){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && boss.getHealth() > 0) {
                heroes[i].applySuperPower(heroes, boss);

            }

        }
        if (boss.getHealth() < 0) {
            boss.setHealth(0);

        }



    }

}
