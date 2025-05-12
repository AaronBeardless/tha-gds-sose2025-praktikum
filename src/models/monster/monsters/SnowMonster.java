package models.monster.monsters;

import models.monster.Monster;

public class SnowMonster extends Monster
{

    // --- Variables ---

    private int freezeStrength;

    // --- Constructors ---

    public SnowMonster()
    {
        this("Olaf", 5, 10);
    }

    public SnowMonster(String name, int strength, int freezeStrength)
    {
        super(name, strength);
        setFreezeStrength(freezeStrength); // Deja-vú
    }

    // --- Getters/Setters ---

    @Override
    public int getStrength()
    {
        return (super.getStrength() + freezeStrength);
    }

    public int getFreezeStrength()
    {
        return freezeStrength;
    }

    public void setFreezeStrength(int freezeStrength)
    {
        if(freezeStrength < 0)
        {
            System.err.println("[WRN] Negative freezeStrength is not allowed. \n \t If you are looking for fire, see FireMonster...");
            return;
        }

        this.freezeStrength = freezeStrength;
    }

    // --- Functions ---

    @Override
    public void fight(Monster foe)
    {
        super.fight(foe);

        // Doubling code... grrr!
        if(getStrength() > foe.getStrength())
            freeze(foe);
    }

    public void freeze(Monster foe)
    {
        System.out.println("Monster '" + getName() + "' has frozen foe '" + foe.getName() + "' with freezeStrength '" + getFreezeStrength() + "'.");
    }

}
