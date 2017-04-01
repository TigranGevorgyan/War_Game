package weapon.human_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Rifle extends Human_weapon {
    private int damage = 37;


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
        return "Rifle";
    }
}
