package models.inventory;

public class Inventory
{

    // --- Variables ---

    Item[] items;
    int itemCount;

    // --- Constructors ---

    public Inventory(int inventorySize)
    {
        items = new Item[inventorySize];
    }

    // --- Functions ---

    public void addItem(Item item)
    {
        if(itemCount >= items.length)
        {
            System.err.println("[ERR] Inventory is full, cannot add item");
            return;
        }

        items[itemCount] = item;
        itemCount++;
    }

    // Removing stuff from an array (in a way that makes sense)
    // is kinda a pain in the ass *and* it is not
    // required by the task, so we won't do it.
    // public void removeItem() {...}

    public void listAllItems()
    {
        System.out.println("===INVENTORY=======================");
        System.out.println("Used/Capacity: " + itemCount + "/" + items.length);

        System.out.println("---ITEMS---------------------------");

        for(Item item : items)
        {
            if(item == null)
                return;

            item.list();
        }

        System.out.println("-----------------------------------");

        System.out.println("===================================");

    }

}
