package exercise_2_1.Models;

import exercise_2_1.Hero;
import exercise_2_1.Interfaces.WeaponType;

public class Shooter extends Hero {
    public Shooter(String name, int health, WeaponType weaponType)
    {
        super(name, health, weaponType);
    }
}
