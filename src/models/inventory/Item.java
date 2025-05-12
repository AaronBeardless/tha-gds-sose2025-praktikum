package models.inventory;

public abstract class Item
{

    // --- Static Variables ---

    private static int itemCount = 0;

    public static int getItemCount()
    {
        return itemCount;
    }

    // --- Variables ---

    private int ID;
    private int weight;

    private String name;

    // --- Constructors ---

    public Item()
    {
        this("The Mysterious floating Orb", -5);
    }

    public Item(String name, int weight)
    {
        this.ID = getItemCount();
        itemCount++;

        this.name = name;
        this.weight = weight;
    }

    // --- Getters/Setters ---

    public int getID()
    {
        return ID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    // --- Functions ---

    public abstract void list();

}
