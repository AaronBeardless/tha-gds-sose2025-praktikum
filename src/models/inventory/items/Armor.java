package models.inventory.items;

import models.inventory.Item;

public class Armor extends Item
{

    // --- Variables ---

    private int absorption;

    // --- Constructors ---

    public Armor()
    {
        this("Leather Armor", 2, 4, 5);
    }

    public Armor(String name, int ID, int weight, int absorption)
    {
        super(name, ID, weight);
        this.absorption = absorption;
    }

    // --- Getters/Setters ---

    public int getAbsorption()
    {
        return absorption;
    }

    public void setAbsorption(int absorption)
    {
        this.absorption = absorption;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        super.list();
        System.out.println("\t [ARMOR] \n \t\t Absorption - '" + getAbsorption() + "'");
    }

    public void determineDefense()
    {
        System.out.println("Defense is '" + absorption + "'.");
    }
}
