package solider.human;

import coordinates.Coodrinates;
import weapon.Weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Infantry extends Human {
    private static final String RACE = "Human";
    private static final String TYPE = "Infantry";
    private static final int STRENGTH = 7;
    private static final int SPEED = 3;
    private float health = 800 ;

    boolean isDied = false;
    boolean isMeet = false;

    public boolean isDied() {
        return isDied;
    }

    public boolean isMeet() {
        return isMeet;
    }

    public void setMeet(boolean meet) {
        isMeet = meet;
    }

    public void setDied(boolean died) {
        isDied = died;
    }

    public Infantry(String name, Coodrinates coodrinates) {
        super(name, coodrinates);
    }

    @Override
    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    @Override
    public String getRACE() {
        return RACE;
    }

    @Override
    public String getTYPE() {
        return TYPE;
    }

    @Override
    public int getSTRENGTH() {
        return STRENGTH;
    }

    @Override
    public int getSPEED() {
        return SPEED;
    }
}
