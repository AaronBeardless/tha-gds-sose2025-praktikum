package models;

import models.monster.Monster;
import models.monster.traits.Companion;

import java.util.ArrayList;
import java.util.List;

public class Hero implements Tamer
{

    // --- Variables ---

    private String name;
    private int strength;
    private int health;

    private List<Companion> companions;

    private final int MAX_HEALTH;

    // --- Constructors ---

    public Hero()
    {
        this("Aloy", 50, 25, 100);
    }

    public Hero(String name, int strength, int health, int maxHealth)
    {
        this.name = name;
        this.strength = strength;

        this.MAX_HEALTH = maxHealth;

        if(health > maxHealth)
        {
            // How...?
            // You literally just passed it in!
            System.err.println("[WRN] Health cannot be larger than MAX_HEALTH!");

            this.health = maxHealth;
            return;
        }

        this.health = health;

        companions = new ArrayList<>();

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

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        if(health < 0)
        {
            System.err.println("[WRN] Health cannot be less than 0!");
            this.health = 0;
        }
        if(health > MAX_HEALTH)
        {
            System.err.println("[WRN] Health cannot be larger than MAX_HEALTH!");
            this.health = MAX_HEALTH;
            return;
        }
        this.health = health;
    }

    public int getMaxHealth()
    {
        return MAX_HEALTH;
    }

    // --- Functions ---

    @Override
    public void addCompanion(Companion companion)
    {
        companions.add(companion);
    }

    @Override
    public void receiveCuddle(int cuddleIntensity)
    {
        System.out.println("Hero '" + getName() + "' has received an intensity '" + cuddleIntensity + "' cuddle.");
    }

    public void fight(Monster foe)
    {
        if(getStrength() < foe.getStrength() || getHealth() == 0)
        {
            System.out.println("Hero '" + getName() + "' has lost against Monster '" + foe.getName() + "'.");
            setHealth(getHealth() - 1);
            return;
        }
        else if(getStrength() == foe.getStrength())
        {
            System.out.println("It's a draw between Hero '" + getName() + "' and Monster '" + foe.getName() + "'.");
            return;
        }

        System.out.println("Hero '" + getName() + "' has won against Monster '" + foe.getName() + "'.");
        setHealth(getHealth() + 1);
    }

    public void fight(Hero foe)
    {
        if(getStrength() < foe.getStrength() || getHealth() == 0)
        {
            System.out.println("Hero '" + getName() + "' has lost against Hero '" + foe.getName() + "'.");
            setHealth(getHealth() - 1);
            return;
        }
        else if(getStrength() == foe.getStrength())
        {
            System.out.println("It's a draw between Hero '" + getName() + "' and Hero '" + foe.getName() + "'.");
            return;
        }

        System.out.println("Hero '" + getName() + "' has won against Hero '" + foe.getName() + "'.");
        foe.setHealth(foe.getHealth() - 1);
        setHealth(getHealth() + 1);
    }

}
