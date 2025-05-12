package models.inventory.items;

import models.inventory.Item;

public class Armor extends Item
{

    // --- Variables ---

    private int absorption;

    // --- Constructors ---

    public Armor()
    {
        this("Leather Armor", 4, 5);
    }

    public Armor(String name, int weight, int absorption)
    {
        super(name, weight);
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
        System.out.println("[ITEM - ARMOR] \n \t ID - '" + getID() + "' \n \t Weight - '" + getWeight() + "' \n \t Name - '" + getName() + "'");
        System.out.println("\t Absorption - '" + getAbsorption() + "'");
    }

    public void determineDefense()
    {
        System.out.println("Defense is '" + absorption + "'.");
    }
}
