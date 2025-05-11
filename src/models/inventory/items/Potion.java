package models.inventory.items;

import models.inventory.Item;

public class Potion extends Item
{

    // --- Variables ---

    private Effect effect;

    // --- Constructors ---

    public Potion(String name, int ID, int weight, Effect effect)
    {
        super(name, ID, weight);
        this.effect = effect;
    }

    // --- Getters/Setters ---

    public Effect getEffect()
    {
        return effect;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        super.list();
        System.out.println("\t [WEAPON] \n \t\t (Effect) --- \n \t\t\t Effect Type - '" + getEffect().getEffectType() + "' \n \t\t\t Effectiveness - '" + getEffect().getEffectiveness() + "'");
    }

    public void determineEffect()
    {
        System.out.println("Effect is '" + getEffect().getEffectType() + "' with effectiveness '" + getEffect().getEffectiveness() + "'.");
    }

}