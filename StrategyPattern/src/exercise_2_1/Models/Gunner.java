package exercise_2_1.Models;

import exercise_2_1.Hero;
import exercise_2_1.Interfaces.WeaponType;

public class Gunner extends Hero {
    public Gunner(String name, int health, WeaponType weaponType)
    {
        super(name, health, weaponType);
    }
}
