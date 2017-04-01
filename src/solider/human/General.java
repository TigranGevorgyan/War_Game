package solider.human;

import coordinates.Coodrinates;
import weapon.Weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class General extends Human {
    private static final String RACE = "Human";
    private static final String TYPE = "General" ;
    private static final int STRENGTH = 10 ;
    private static final int SPEED = 2 ;
    private float health = 1000 ;

    boolean isDied = false;

    boolean isMeet = false;

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

    public General(String name, Coodrinates coodrinates) {
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
