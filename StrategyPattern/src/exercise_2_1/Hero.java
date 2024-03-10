package exercise_2_1;

import exercise_2_1.Interfaces.WeaponType;

public abstract class Hero {
    private String name; 
    private int health;
    private WeaponType weaponType;

    public Hero(String name, int health, WeaponType weaponType)
    {
        this.name = name;
        this.health = health;
        this.weaponType = weaponType;
    }

    public String getName()
    {
        return this.name;
    }

    public void getWeaponType()
    {
        this.weaponType.ShowWeaponType();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWeaponType(WeaponType weaponType)
    {
        this.weaponType = weaponType;
    }

    @Override
    public String toString()
    {
        return "Hero's name: " + this.name + ", " + "Hero's health: " + this.health;
    }
}
