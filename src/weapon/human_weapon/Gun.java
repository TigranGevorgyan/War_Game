package weapon.human_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Gun extends Human_weapon {
//    private static final int damage = 18;


    @Override
    public int getDamage(){
        return 18;
    }

    @Override
    public String getWeaponType() {
        return "Gun";
    }


}
