package models.inventory.items;

import models.inventory.Item;

public class Weapon extends Item
{

    // --- Variables ---

    private int strength;
    private int damage;

    // --- Constructors ---

    public Weapon()
    {
        this("Wooden Sword", 1, 3, 2, 5);
    }

    public Weapon(String name, int ID, int weight, int strength, int damage)
    {
        super(name, ID, weight);
        this.strength = strength;
        this.damage = damage;
    }

    // --- Getters/Setters ---

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public int getDamage()
    {
        return damage;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        super.list();
        System.out.println("\t [WEAPON] \n \t\t Strength - '" + getStrength() + "' \n \t\t Damage - '" + getDamage() + "'");
    }

    public void determineAttack()
    {
        System.out.println("Attack is '" + (getDamage() * getStrength()) + "'.");
    }

}
