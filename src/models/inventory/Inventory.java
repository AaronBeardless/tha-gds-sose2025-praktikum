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

    public void removeItem(Item item)
    {
        // User is being stupid, stop them
        if(itemCount < 1)
            return;

        // Find the index of the item we want to remove
        // Trust me, we'll need this later.
        for(int i = 0; i < itemCount; i++)
        {
            if(items[i] == item)
            {
                removeItemFromIndex(i);
                return;
            }
        }

        System.err.println("[ERR] Cannot remove Item! It is no longer in the inventory - or was never in it to begin with.");

    }

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

    private void removeItemFromIndex(int index)
    {
        // What is happening here?:
        // *Basically,* we cut the array at the point
        // we need to remove the index. Then we keep
        // everything up until that point and shift
        // the rest back down.
        // This means that we have no "empty holes" in
        // the array which could cause issues later;

        // get the first part
        Item[] firstHalf = new Item[index];
        for(int i = 0; i < index; i++)
        {
            firstHalf[i] = items[i];
        }

        // and now the other one
        Item[] secondHalf = new Item[itemCount - index - 1];
        if (index < itemCount - 1)
        {
            for (int i = index + 1; i < itemCount; i++)
            {
                secondHalf[i - index - 1] = items[i];
            }
        }

        // Now put them back
        for(int i = 0; i < firstHalf.length; i++)
        {
            items[i] = firstHalf[i];
        }

        for(int i = 0; i < secondHalf.length; i++)
        {
            items[firstHalf.length + i] = secondHalf[i];
        }

    }

}
