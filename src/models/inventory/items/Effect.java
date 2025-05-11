package models.inventory.items;

public class Effect
{

    // --- Variables ---

    private String effectType;
    private int effectiveness;

    // --- Constructors ---

    public Effect()
    {
        this("Weird Effect", 1);
    }

    public Effect(String effectType, int effectiveness)
    {
        this.effectType = effectType;
        this.effectiveness = effectiveness;
    }

    // --- Getters/Setters ---

    public String getEffectType()
    {
        return effectType;
    }

    public int getEffectiveness()
    {
        return effectiveness;
    }

    public void setEffectiveness(int effectiveness)
    {
        this.effectiveness = effectiveness;
    }

}
