package weapon.human_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Shotgun extends Human_weapon {
//    private static final int damage = 62;

    @Override
    public int getDamage(){
        return 62;
    }

    @Override
    public String getWeaponType() {
        return "Shotgun";
    }

}
