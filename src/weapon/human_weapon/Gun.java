package weapon.human_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Gun extends Human_weapon {
    private  int damage = 18;


    @Override
    public int getDamage(){
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String getWeaponType() {
        return "Gun";
    }


}
