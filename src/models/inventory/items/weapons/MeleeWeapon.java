package models.inventory.items.weapons;

import models.inventory.items.Weapon;

public class MeleeWeapon extends Weapon
{

    // --- Variables ---

    int sweep;

    // --- Constructors ---

    public MeleeWeapon()
    {
        this("Axe", 5, 5, 3, 2);
    }

    public MeleeWeapon(String name, int weight, int strength, int damage, int sweep)
    {
        super(name, weight, strength, damage);
        this.sweep = sweep;
    }

    // --- Getters/Setters ---

    public int getSweep()
    {
        return sweep;
    }

    public void setSweep(int sweep)
    {
        this.sweep = sweep;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        super.list();
        System.out.println("\t [MELEE WEAPON] \n \t\t Sweep - '" + getSweep() + "'");
    }

    @Override
    public void determineAttack()
    {
        System.out.println("Attack is '" + ((getStrength() * getDamage()) + getSweep()) + "'.");
    }
}
