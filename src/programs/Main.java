package programs;

import models.inventory.Inventory;
import models.inventory.Item;
import models.inventory.items.*;

public class Main
{

    public static void main(String[] args)
    {

        Weapon sword = new Weapon("Sting", 1, 2, 5, 1, 15);

        Effect poison = new Effect("Poison", 5);
        Potion potionOfDeath = new Potion("The Potion of Instant Harm", 2, 1, poison);

        Armor leatherArmor = new Armor("Leather Armor", 3, 4, 10);

        Effect uncooked = new Effect("Uncooked", 5);
        Food steak = new Food("Steak", 4, 1, uncooked);

        Item genericItem = new Item("Generic Item", 0, 0);

        Inventory inventory = new Inventory(5);

        inventory.addItem(sword);
        inventory.addItem(potionOfDeath);
        inventory.addItem(leatherArmor);
        inventory.addItem(steak);
        inventory.addItem(genericItem);

        inventory.listAllItems();

        System.out.println("\n Steak cooking");

        steak.list();

        steak.cook();
        steak.list();

        steak.cook();
        steak.list();

    }

}
