package models.inventory.items.weapons;

import models.inventory.items.Weapon;

public class RangedWeapon extends Weapon
{

    // --- Variables ---

    int range;

    // --- Constructors ---

    public RangedWeapon()
    {
        this("Shortbow", 5, 4, 5, 5, 12);
    }

    public RangedWeapon(String name, int ID, int weight, int strength, int damage, int range)
    {
        super(name, ID, weight, strength, damage);
        this.range = range;
    }

    // --- Getters/Setters ---

    public int getRange()
    {
        return range;
    }

    public void setRange(int range)
    {
        this.range = range;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        super.list();
        System.out.println("\t\t [RANGED WEAPON] \n \t\t\t Range - '" + getRange() + "'");
    }

    @Override
    public void determineAttack()
    {
        System.out.println("Attack is '" + ((getStrength() * getDamage()) * getRange()) + "'.");
    }

}
