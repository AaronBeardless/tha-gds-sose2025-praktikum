package programs;

import models.inventory.Item;
import models.inventory.items.*;

public class Main
{

    public static void main(String[] args)
    {

        Item[] items = new Item[5];

        Weapon sword = new Weapon("Sting", 1, 2, 5, 1, 15);

        Effect poison = new Effect("Poison", 5);
        Potion potionOfDeath = new Potion("The Potion of Instant Harm", 2, 1, poison);

        Armor leatherArmor = new Armor("Leather Armor", 3, 4, 10);

        Food steak = new Food("Steak", 4, 1, 5);

        Item genericItem = new Item("Generic Item", 0, 0);

        items[0] = sword;
        items[1] = potionOfDeath;
        items[2] = leatherArmor;
        items[3] = steak;
        items[4] = genericItem;

        // List it all out!

        for(Item item : items)
        {
            if(item == null)
                continue;

            item.list();
        }

    }

}
