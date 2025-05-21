package programs;

import models.Hero;
import models.inventory.Inventory;
import models.inventory.Item;
import models.inventory.items.*;
import models.inventory.items.weapons.MeleeWeapon;
import models.inventory.items.weapons.RangedWeapon;
import models.monster.Monster;
import models.monster.monsters.FireMonster;
import models.monster.monsters.SnowMonster;
import models.monster.monsters.firemonsters.Phoenix;

public class Main
{

    private static void printItemCount()
    {
        System.out.println("Current Item Count: '" + Item.getItemCount() + "'.");
    }

    private static void testInventory()
    {

        Weapon sword = new Weapon("Sting", 2, 5, 1);

        printItemCount();

        Effect poison = new Effect("Poison", 5);
        Potion potionOfDeath = new Potion("The Potion of Instant Harm", 1, poison);

        printItemCount();

        Armor leatherArmor = new Armor("Leather Armor", 4, 10);

        printItemCount();

        Effect uncooked = new Effect("Uncooked", 5);
        Food steak = new Food("Steak", 1, uncooked);

        printItemCount();

        Inventory inventory = new Inventory(12);

        inventory.addItem(sword);
        inventory.addItem(potionOfDeath);
        inventory.addItem(leatherArmor);
        inventory.addItem(steak);
        inventory.addItem(new Food());
        inventory.addItem(new Armor());
        inventory.addItem(new Weapon());
        inventory.addItem(new Potion());
        inventory.addItem(new MeleeWeapon());
        inventory.addItem(new RangedWeapon());
        inventory.addItem(new Food());
        inventory.addItem(new RangedWeapon());

        // This should throw an error
        inventory.addItem(new Food());

        inventory.listAllItems();

        inventory.removeItem(potionOfDeath);

        inventory.listAllItems();

        printItemCount();

        // Test iterable

        for(Item item : inventory)
        {
            item.list();
        }

    }

    private static void testFight()
    {

        FireMonster ghast = new FireMonster("Ghast", 10, 2);
        SnowMonster snowman = new SnowMonster("Snowman", 10, 2);

        Phoenix fawkes = new Phoenix();

        Hero john = new Hero("John Nolan", 10, 25, 50);
        Hero aloy = new Hero();

        System.out.println();
        System.out.println("===FIGHT=RING======================");

        // Everybody fight!

        ghast.fight(snowman);
        snowman.fight(fawkes);

        john.fight(ghast);
        aloy.fight(fawkes);

        aloy.fight(john);

        System.out.println("===================================");

    }

    public static void testTaming()
    {

        System.out.println("===TAMING==========================");

        Hero tamer = new Hero("Steve", 25, 50, 100);

        Phoenix phoenix = new Phoenix();
        SnowMonster snowy = new SnowMonster();

        phoenix.getTamed(tamer);
        snowy.getTamed(tamer);

        phoenix.cuddle(5);

        System.out.println("===================================");

    }

    public static void main(String[] args)
    {

        testInventory();

        testFight();

        testTaming();

    }

}
