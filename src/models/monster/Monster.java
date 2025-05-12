package models.monster;

// I guess it could be abstract...
public abstract class Monster
{

    // --- Variables ---

    private String name;
    private int strength;

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
