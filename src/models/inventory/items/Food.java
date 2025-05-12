package models.inventory.items;

import models.inventory.Item;

public class Food extends Item
{

    // --- Variables ---

    private Effect effect;

    // --- Constructors ---

    public Food()
    {
        this("Apple", 1, new Effect("Nutritional", 7));
    }

    public Food(String name, int weight, Effect effect)
    {
        super(name, weight);
        this.effect = effect;
    }

    // --- Getters/Setters ---

    public Effect getEffect()
    {
        return effect;
    }

    public void setNutrition(Effect effect)
    {
        this.effect = effect;
    }

    // --- Functions ---

    @Override
    public void list()
    {
        System.out.println("[ITEM - FOOD] \n \t ID - '" + getID() + "' \n \t Weight - '" + getWeight() + "' \n \t Name - '" + getName() + "'");
        System.out.println("\t (Effect) --- \n \t\t Effect Type - '" + getEffect().getEffectType() + "' \n \t\t Effectiveness - '" + getEffect().getEffectiveness() + "'");
    }

    public void cook()
    {
        if(effect.getEffectType() == "Uncooked")
        {
            // We cook the meal, yum-yum!
            effect = new Effect("Nutritional", getEffect().getEffectiveness() * 2);
        }
        else if (effect.getEffectType() == "Nutritional")
        {
            // We have either overcooked a meal or cooked something that isn't cookable, ew...
            effect = new Effect("Unsavory", 1);
        }

        // Otherwise nothing happens

    }
}
