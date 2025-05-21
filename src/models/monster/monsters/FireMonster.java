package models.monster.monsters;

import models.Hero;
import models.monster.Monster;

public class FireMonster extends Monster
{

    // --- Variables ---

    private int heat;

    // --- Constructors ---

    public FireMonster()
    {
        this("Lava Chicken", 2, 10);
    }

    public FireMonster(String name, int strength, int heat)
    {
        super(name, strength);
        setHeat(heat); // So we don't have to check twice
    }

    // --- Getters/Setters ---

    @Override
    public int getStrength()
    {
        return (super.getStrength() + getHeat());
    }

    public int getHeat()
    {
        return heat;
    }

    public void setHeat(int heat)
    {
        if(heat < 0)
        {
            System.err.println("[WRN] Negative heat is not allowed. \n \t If you are looking for freezing, see SnowMonster...");
            return;
        }
        this.heat = heat;
    }

    // --- Functions ---

    @Override
    public void fight(Monster foe)
    {
        super.fight(foe);

        // Ouch, ouch, bad, very ouch
        if(getStrength() > foe.getStrength())
            setOnFire(foe);
    }

    public void setOnFire(Monster foe)
    {
        System.out.println("Monster '" + getName() + "' has set foe '" + foe.getName() + "' on fire with heat '" + getHeat() + "'.");
    }

}
