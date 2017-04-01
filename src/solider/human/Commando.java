package solider.human;

import coordinates.Coodrinates;
import weapon.Weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Commando extends Human {
    private static final String RACE = "Human";
    private static final String TYPE = "Commando" ;
    private static final int STRENGTH = 12 ;
    private static final int SPEED = 4 ;
    private static final int HEALTH = 850 ;

    private float health = 850 ;

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

    public Commando(String name, Coodrinates coodrinates) {
        super(name, coodrinates);
    }

    public boolean isDied() {
        return isDied;
    }

    public void setDied(boolean died) {
        isDied = died;
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
