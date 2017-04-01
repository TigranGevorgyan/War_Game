package solider.mystic;

import coordinates.Coodrinates;
import weapon.Weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Troll extends Mystic {
    private static final String RACE = "Mystic";
    private static final String TYPE = "Troll" ;
    private static final int STRENGTH = 30 ;
    private static final int SPEED = 2;
    private static final int HEALTH = 2000 ;
    private float health = 2000;

    boolean isDied = false;
    boolean isMeet = false;

    public int getHEALTH() {
        return HEALTH;
    }

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

    public Troll(String name, Coodrinates coodrinates) {
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
