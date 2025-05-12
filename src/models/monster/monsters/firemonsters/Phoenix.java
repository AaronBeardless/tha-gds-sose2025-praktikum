package models.monster.monsters.firemonsters;

import models.monster.Monster;
import models.monster.monsters.FireMonster;

public final class Phoenix extends FireMonster
{

    // --- Variables ---

    private int age;

    // --- Constructors ---

    public Phoenix()
    {
        this("Fawkes", 10, 5, 57);
    }

    public Phoenix(String name, int strength, int heat, int age)
    {
        super(name, strength, heat);
        setAge(age); // Skibidi-bop-md-dada!
    }

    // --- Getters/Setters ---

    @Override
    public int getStrength()
    {
        // The older a phoenix is, the less strength he has left
        return (int)(super.getStrength() * (1.0f - (0.01f * (age / 2.0f))));
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if(age < 0)
        {
            System.err.println("[WRN] Negative Age is not allowed!");
        }
        if(age > 100)
        {
            resurrect();
            return;
        }

        this.age = age;
    }

    // --- Functions ---

    @Override
    public void fight(Monster foe)
    {
        super.fight(foe);

        // Each fight ages the phoenix
        // We use setAge() here so resurrection does not
        // need to be managed separately
        setAge(getAge() + 1);
    }

    public void resurrect()
    {
        System.out.println("Phoenix '" + getName() + "' has died and is now being reborn.");
        setAge(0);
    }
}
