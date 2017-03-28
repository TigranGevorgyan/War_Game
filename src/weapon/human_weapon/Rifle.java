package weapon.human_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Rifle extends Human_weapon {
//    private static final int damage = 37;


    @Override
    public int getDamage(){
        return 37;
    }

    @Override
    public String getWeaponType() {
        return "Rifle";
    }
}
