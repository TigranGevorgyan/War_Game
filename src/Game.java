import coordinates.Coodrinates;
import solider.Solider;
import solider.human.Commando;
import solider.human.General;
import solider.human.Human;
import solider.human.Infantry;
import solider.mystic.Elf;
import solider.mystic.Mystic;
import solider.mystic.Orc;
import solider.mystic.Troll;
import weapon.human_weapon.Gun;
import weapon.human_weapon.Rifle;
import weapon.human_weapon.Shotgun;
import weapon.mystic_weapon.Axe;
import weapon.mystic_weapon.Knife;
import weapon.mystic_weapon.Sword;

import java.nio.channels.Pipe;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Taron on 03/27/17.
 */
public class Game {
    int line;
    int column;
    int deadHumans;
    int deadMystic;
    int positionWhenMeet;
    int id;
    int meetCount;
    float bonusHumans = 1.0F;
    float bonusMystics = 1.0F;
    float healthBeforeBlow;
    boolean answer = false;


    public Game(int x, int y) {
        line = x;
        column = y;
    }

    public Human[] humanDistribution() {
        Human[] humens = new Human[line];
        int[] rundoms = makeRundomsArray();
        if (humens.length != 0) {
            humens[0] = new General("General", new Coodrinates(0, rundoms[0]));
            humens[0].setWeapon(new Shotgun());
        }
        for (int i = 1; i < humens.length; i++) {
            if (rundoms[i] % 2 == 0) {
                humens[i] = new Commando("Commando" + i, new Coodrinates(0, rundoms[i]));
                humens[i].setWeapon(new Rifle());
            } else {
                humens[i] = new Infantry("Infantry" + i, new Coodrinates(0, rundoms[i]));
                humens[i].setWeapon(new Gun());
            }
        }
        return humens;
    }

    public Mystic[] mysticDistribution() {
        Mystic[] mystics = new Mystic[line];
        int[] rundoms = makeRundomsArray();
        if (mystics.length != 0) {
            mystics[0] = new Troll("Troll", new Coodrinates(column, rundoms[0]));
            mystics[0].setWeapon(new Axe());
        }
        for (int i = 1; i < mystics.length; i++) {
            if (rundoms[i] % 2 == 0) {
                mystics[i] = new Orc("Orc" + i, new Coodrinates(column, rundoms[i]));
                mystics[i].setWeapon(new Sword());
            } else {
                mystics[i] = new Elf("Elf" + i, new Coodrinates(column, rundoms[i]));
                mystics[i].setWeapon(new Knife());
            }
        }
        return mystics;
    }

    public int[] makeRundomsArray() {
        boolean contain = false;
        int a;
        int[] rundoms = new int[line];
        rundoms[0] = ThreadLocalRandom.current().nextInt(0, line);
        for (int i = 1; i < line; ) {
            a = ThreadLocalRandom.current().nextInt(0, line);
            for (int j = 0; j < i; j++) {
                if (a != rundoms[j])
                    contain = true;
                else {
                    contain = false;
                    break;
                }
            }
            if (contain) {
                rundoms[i] = a;
                i++;
            }
        }

        return rundoms;
    }

    public void walk() {
        Human[] humans = humanDistribution();
        Mystic[] mystics = mysticDistribution();
        while (meetCount != humans.length) {
            for (int i = 0; i < humans.length; i++) {
                for (int j = 0; j < mystics.length; j++)
                    if (humans[i].isDied() == false) {
                        {
                                if (humans[i].getY() == mystics[j].getY()) {
                                    if (humans[i].isMeet() == false) {
                                        humans[i].setX(humans[i].getX() + humans[i].getSPEED());
                                        mystics[j].setX(mystics[j].getX() - mystics[j].getSPEED());
                                        System.out.println(humans[i].getName() + " position " + humans[i].getX() + "     " +
                                                mystics[j].getName() + " position " + mystics[j].getX());
                                    }
                                    if ((humans[i].getX() == mystics[j].getX()) || (humans[i].getX() > mystics[j].getX())) {
                                        if (humans[i].isMeet() == false) {
                                            positionWhenMeet = humans[i].getX();
                                            System.out.println("Position when meet : " + positionWhenMeet);
                                        }
                                        humans[i].setMeet(true);
                                        fight(humans[i], mystics[j]);
                                        if (answer) {
                                            meetCount++;
                                            answer = false;
                                        }
                                }
                            }
                        }
                    }
            }
        }

    }

    public void bouusStrenght(Human obj, Mystic obj1) {
        if(obj.isMeet() == false) {
            if (positionWhenMeet < column / 2) {
                System.out.println("Thay was meeting in position <" + positionWhenMeet +
                        "> for this reason " + obj.getName() + " strenght increased 1.2 times.");
                bonusHumans = 1.2F;
            }
            if (positionWhenMeet > column / 2) {
                System.out.println("Thay was meeting in position <" + positionWhenMeet +
                        "> for this reason " + obj1.getName() + " strenght increased 1.2 times.");
                bonusMystics = 1.2F;
            }
        }
    }

    public void fight(Human obj, Mystic obj1) {

        bouusStrenght(obj, obj1);
        if (obj.isMeet() == false) {
            if (obj1.getSTRENGTH() > obj.getSTRENGTH())
                System.out.println(obj1.getName() + " was strogner,for that reason he allowing " + obj.getName() + " to hit first.  ");
            else
                System.out.println(obj.getName() + " was strogner,for that reason he allowing " + obj1.getName() + " to hit first.  ");
        }

        while (obj.getHealth() > 0 && obj1.getHealth() > 0) {
            id ++;
            System.out.println(id + " raund:");
            healthBeforeBlow = obj.getHealth();
            obj.setHealth(obj.getHealth() - ((bonusMystics * obj1.getSTRENGTH()) + obj1.getWeapon().getDamage()));
            System.out.println(obj.getName() + " HEALTH:  After: " + healthBeforeBlow + "    Before: " + obj.getHealth());
            healthBeforeBlow = obj1.getHealth();
            obj1.setHealth(obj1.getHealth() - ((bonusHumans * obj.getSTRENGTH()) + obj.getWeapon().getDamage()));
            System.out.println(obj1.getName() + " HEALTH:  After: " + healthBeforeBlow + "   Before: " + obj1.getHealth());
            areDied(obj);
            areDied(obj1);
            System.out.println("Dead humans: " + deadHumans);
            System.out.println("Dead mystic: " + deadMystic);
            break;
        }
        if( !(obj.isDied()) || !(obj1.isDied())) {
            System.out.println("----------------------------");
        }
        finishWar();
    }

    public void finishWar() {
        if (deadHumans == deadMystic
                && deadHumans != 0
                && deadHumans + deadMystic == line) {
            System.out.println("War was finished,and no one won!!!");
            return;
        }
        if (deadHumans > line / 2) {
            System.out.println("Mystics are win!!!");
            return;
        }
        if (deadMystic > line / 2) {
            System.out.println("Humans are win!!!");
            return;
        }
    }

    public void areDied(Solider obj){
        if (obj.getHealth() <= 0) {
            obj.setDied(true);
            if (obj instanceof Mystic)
            deadMystic ++;
            else deadHumans ++;
            System.out.println("OOOOOOOOOps " + obj.getName() + " was died");
            answer = true;
        }
    }

    public void start() {
        walk();
    }
}
