package weapon.mystic_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Sword extends Mystic_weapon {
//    private static final int damage = 13;

    @Override
    public int getDamage() {
        return 13;
    }

    @Override
    public String getWeaponType() {
        return "Sword";
    }
}
