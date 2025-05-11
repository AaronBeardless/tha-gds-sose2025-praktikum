package models.inventory.items;

import models.inventory.Item;

public class Food extends Item
{

    // --- Variables ---

    private int nutrition;

    // --- Constructors ---

    public Food(String name, int ID, int weight, int nutrition)
    {
        super(name, ID, weight);
        this.nutrition = nutrition;
    }

    // --- Getters/Setters ---

    public int getNutrition()
    {
        return nutrition;
    }

    public void setNutrition(int nutrition)
    {
        this.nutrition = nutrition;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        super.list();
        System.out.println("\t [FOOD] \n \t\t Strength - '" + getNutrition() + "'");
    }

    public void cook()
    {
        // Doubly tasty!
        nutrition *= 2;
    }
}
