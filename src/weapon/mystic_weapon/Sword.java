package weapon.mystic_weapon;

/**
 * Created by Taron on 03/27/17.
 */
public class Sword extends Mystic_weapon {
    private int damage = 13;

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String getWeaponType() {
        return "Sword";
    }
}
