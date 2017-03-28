package solider.mystic;


import coordinates.Coodrinates;
import weapon.Weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Orc extends Mystic {
    private static final String RACE = "Mystic";
    private static final String TYPE = "Orc" ;
    private static final int STRENGTH = 15 ;
    private static final int SPEED = 1 ;
    private float health = 1200;

    public Orc(String name, Coodrinates coodrinates) {
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
