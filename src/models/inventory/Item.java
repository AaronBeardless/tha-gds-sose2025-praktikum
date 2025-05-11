package models.inventory;

public class Item
{

    // --- Variables ---

    private int ID;
    private int weight;

    private String name;

    // --- Constructors ---

    public Item()
    {
        this("The Mysterious floating Orb", 0, -5);
    }

    public Item(String name, int ID, int weight)
    {
        this.name = name;
        this.ID = ID;
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

    public void list()
    {
        System.out.println("[Item] \n \t ID - '" + getID() + "' \n \t Weight - '" + getWeight() + "' \n \t Name - '" + getName() + "'");
    }

}
