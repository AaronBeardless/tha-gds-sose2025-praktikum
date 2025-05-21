package programs;

import models.CustomLinkedList;
import models.ListElement;

public class Main
{

    public static void main(String[] args)
    {

        ListElement<Integer> integerListElement1 = new ListElement<Integer>(1);
        ListElement<Integer> integerListElement2 = new ListElement<Integer>(2);
        ListElement<Integer> integerListElement3 = new ListElement<Integer>(3);
        ListElement<Integer> integerListElement4 = new ListElement<Integer>(4);
        ListElement<Integer> integerListElement5 = new ListElement<Integer>(5);

        CustomLinkedList<Integer> integerList = new CustomLinkedList<Integer>();

        integerList.addToEnd(integerListElement1);
        integerList.addToEnd(integerListElement2);
        integerList.addToFront(integerListElement3);
        integerList.addToFront(integerListElement4);
        integerList.addAtIndex(1, integerListElement5);

        integerList.printList();

        System.out.println("===ERROR_TESTING======================");

        ListElement<String> stringListElement1 = new ListElement<String>("Number #1");
        ListElement<String> stringListElement2 = new ListElement<String>("Number #2");
        ListElement<String> stringListElement3 = new ListElement<String>("Number #3");
        ListElement<String> stringListElement4 = new ListElement<String>("Number #4");
        ListElement<String> stringListElement5 = new ListElement<String>("Number #5");

        CustomLinkedList<String> stringList = new CustomLinkedList<String>();

        stringList.addToFront(stringListElement1);
        stringList.addAtIndex(5, stringListElement2);
        stringList.addAtIndex(-2, stringListElement4);

    }

}
