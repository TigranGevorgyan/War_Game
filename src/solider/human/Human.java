package solider.human;

import coordinates.Coodrinates;
import solider.Solider;
import weapon.Weapon;

/**
 * Created by Taron on 03/27/17.
 */
public abstract class Human extends Solider {


    public Human(String name, Coodrinates coodrinates) {
        super(name, coodrinates);
    }
}
