package models.monster;

import models.Hero;
import models.Tamer;
import models.monster.traits.Companion;

// I guess it could be abstract...
public abstract class Monster implements Companion
{

    // --- Variables ---

    private String name;
    private int strength;

    private Tamer tamer;

    // --- Constructors ---

    public Monster()
    {
        this("Jeff", 100000000);
    }

    public Monster(String name, int strength)
    {
        this.name = name;
        this.strength = strength;
    }

    // --- Getters/Setters ---

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    // --- Functions ---

    @Override
    public void getTamed(Hero tamer)
    {
        if(this.tamer != null)
        {
            System.out.println("Monster '" + getName() + "' is already tamed!");
            return;
        }

        if(getStrength() > tamer.getStrength())
        {
            System.out.println("Monster '" + getName() + "' refused to be tamed by Hero '" + tamer.getName() + "'.");
            return;
        }

        System.out.println("Monster '" + getName() + "' was successfully tamed by Hero '" + tamer.getName() + "'.");
        this.tamer = tamer;

    }

    @Override
    public void cuddle(int cuddleIntensity)
    {
        System.out.println("Monster '" + getName() + "' is sending cuddle to tamer with intensity '" + cuddleIntensity + "'.");
        tamer.receiveCuddle(cuddleIntensity);
    }

    public void fight(Monster foe)
    {
        if(getStrength() < foe.getStrength())
        {
            System.out.println("Oh No! Monster '" + getName() + "' has lost against Monster '" + foe.getName() + "'!");
            return;
        }
        else if(getStrength() == foe.getStrength())
        {
            System.out.println("What? It's a draw between Monster '" + getName() + "' and '" + foe.getName() + "'?!");
            return;
        }

        System.out.println("Yippee! Monster '" + getName() + "' has won against '" + foe.getName() + "'!");
    }

}
