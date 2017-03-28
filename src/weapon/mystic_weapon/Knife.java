package weapon.mystic_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Knife extends Mystic_weapon {
//    private static final int damage = 8;

    @Override
    public int getDamage(){
        return 8;
    }

    @Override
    public String getWeaponType() {
        return "Knife";
    }


}
