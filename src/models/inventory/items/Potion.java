package models.inventory.items;

import models.inventory.Item;

public class Potion extends Item
{

    // --- Variables ---

    private Effect effect;
    private int range;
    private int tastiness;

    // --- Constructors ---

    public Potion()
    {
        this("Useless Potion", 2, new Effect());
    }

    public Potion(String name, int weight, Effect effect)
    {
        this(name, weight, effect, 2, 1);
    }

    public Potion(String name, int weight, Effect effect, int range, int tastiness)
    {
        super(name, weight);
        this.effect = effect;
        this.range = range;
        this.tastiness = tastiness;
    }

    // --- Getters/Setters ---

    public Effect getEffect()
    {
        return effect;
    }

    public int getRange()
    {
        return range;
    }

    public void setRange(int range)
    {
        this.range = range;
    }

    public int getTastiness()
    {
        return tastiness;
    }

    public void setTastiness(int tastiness)
    {
        this.tastiness = tastiness;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        System.out.println("[ITEM - POTION] \n \t ID - '" + getID() + "' \n \t Weight - '" + getWeight() + "' \n \t Name - '" + getName() + "'");
        System.out.println("\t\t (Effect) --- \n \t\t Effect Type - '" + getEffect().getEffectType() + "' \n \t\t Effectiveness - '" + getEffect().getEffectiveness() + "' \n \t Range - '" + getRange() + "' \n \t Tastiness - '" + getTastiness() + "'");
    }

    public void determineEffect()
    {
        System.out.println("Effect is '" + getEffect().getEffectType() + "' with effectiveness '" + getEffect().getEffectiveness() + "'.");
    }

}