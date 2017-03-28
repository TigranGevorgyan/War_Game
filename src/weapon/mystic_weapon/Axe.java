package weapon.mystic_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Axe extends Mystic_weapon {
    //private static final int damage = 15;


    @Override
    public int getDamage(){
        return 15;
    }

    @Override
    public String getWeaponType() {
        return "Axe";
    }

}
