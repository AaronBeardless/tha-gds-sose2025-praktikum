package models.inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Item>
{

    // --- Variables ---

    private List<Item> items;
    private final int MAX_INVENTORY_SIZE;

    // --- Constructors ---

    public Inventory(int inventorySize)
    {
        items = new ArrayList<Item>(inventorySize);
        MAX_INVENTORY_SIZE = inventorySize;
    }

    // --- Functions ---

    @Override
    public Iterator<Item> iterator()
    {
        return items.iterator();
    }

    public void addItem(Item item)
    {
        if(items.size() >= MAX_INVENTORY_SIZE)
        {
            System.err.println("[ERR] Inventory is full, cannot add item");
            return;
        }

        items.add(item);
    }

    public void removeItem(Item item)
    {

        items.remove(item);

    }

    public void listAllItems()
    {
        System.out.println("===INVENTORY=======================");
        System.out.println("Used/Capacity: " + items.size() + "/" + MAX_INVENTORY_SIZE);

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

        items.remove(index);

    }
}
