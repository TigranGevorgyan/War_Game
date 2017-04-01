package solider;

import coordinates.Coodrinates;
import solider.human.Human;
import weapon.Weapon;
import weapon.human_weapon.Human_weapon;
import weapon.mystic_weapon.Axe;
import weapon.mystic_weapon.Knife;
import weapon.mystic_weapon.Sword;

/**
 * Created by Taron on 03/27/17.
 */
public abstract class Solider {

    String name;
    Coodrinates coodrinates;
    Weapon weapon;

    public Solider(String name, Coodrinates coodrinates) {
        this.name = name;
        this.coodrinates = coodrinates;
    }

    public abstract  String getRACE();

    public abstract String getTYPE();

    public abstract float getHealth();

    public abstract void setHealth(float health);

    public abstract int getSTRENGTH();

    public abstract int getSPEED();

    public abstract boolean isDied();

    public abstract void setDied(boolean died);

    public abstract boolean isMeet();

    public abstract void setMeet(boolean meet);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return coodrinates.getX();
    }

    public int getY(){
        return coodrinates.getY();
    }

    public void setX(int value){
        coodrinates.setX(value);
    }

    public void setY(int value){
        coodrinates.setY(value);
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }


}
