package solider.mystic;

import coordinates.Coodrinates;
import weapon.Weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Elf extends Mystic {
    private static final String RACE = "Mystic";
    private static final String TYPE = "Elf" ;
    private static final int STRENGTH = 10 ;
    private static final int SPEED = 5 ;
    private static final int HEALTH = 800 ;
    private float health = 800;

    boolean isDied = false;
    boolean isMeet = false;

    public int getHEALTH() {
        return HEALTH;
    }

    public boolean isMeet() {
        return isMeet;
    }

    public void setMeet(boolean meet) {
        isMeet = meet;
    }

    public boolean isDied() {
        return isDied;
    }

    public void setDied(boolean died) {
        isDied = died;
    }

    public Elf(String name, Coodrinates coodrinates) {
        super(name, coodrinates);
    }

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
