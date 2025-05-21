package models;

import java.util.List;

/// # Custom Linked List
/// Eine sehr einfache (und vermutlich nicht effiziente) Implementierung
/// einer Linked List.
///
/// @param <T> Die Art des Elements, welches in der Liste hinterlegt ist
public class CustomLinkedList<T>
{

    // --- Variables ---

    /// Das erste Element in der Liste <br>
    /// (oder [null] falls die Liste leer ist)
    private ListElement<T> head;
    /// Die Anzahl der Elemente, die sich in der Liste befinden
    private int amountOfElements;

    /// Fügt ein Element am Anfang der Liste ein.
    public void addToFront(ListElement<T> e)
    {
        // Um das zu erreichen, setzten wir lediglich den Link zum ersten
        // Element auf ein neues Element und sagen dem neuen Element, dass
        // es auf das vorherige erste Element verweißen soll.

        if(head == null)
        {
            // Die Liste ist leer, also müssen wir nichts neu verlinken
            head = e;
            amountOfElements++;
            return;
        }

        e.setNext(head);
        head = e;
        amountOfElements++;
    }

    public void addToEnd(ListElement<T> e)
    {
        if(head == null)
        {
            // Die Liste ist leer, also können wir einfach am Head
            // einfügen...
            head = e;
            amountOfElements++;
        }

        ListElement<T> current = head;
        for(int i = 0; i <= amountOfElements; i++)
        {
            if(current.getNext() == null)
            {
                // Das sollte nicht passieren.
                // Es heißt aber lediglich nur, dass nicht so viele Elemente
                // in der Liste sind, wie wir erwartet hätten.
                // Mit break; sind wir dann trotzdem am letzten Element.

                // Wir nehmen hier auch gleich mal ne Korrektur vor
                amountOfElements = i;
                break;
            }
            current = current.getNext();
        }

        current.setNext(e);
        amountOfElements++;
    }

    public void addAtIndex(int pos, ListElement<T> e)
    {
        if(pos > amountOfElements || pos < 0)
        {
            // Der Index ist nicht vorhanden!
            System.err.println("[ERR] Index out of Bounds!");
            return;
        }

        if(pos == amountOfElements)
        {
            // Wir wollen am Ende einfügen
            addToEnd(e);
            return;
        }

        if(pos == 0)
        {
            // Wir wollen am Anfang einfügen
            addToFront(e);
            return;
        }

        ListElement<T> current = head;
        for(int i = 0; i <= amountOfElements; i++)
        {
            if(i == pos)
            {
                // Hier wollen wir also was einfügen!

                e.setNext(current.getNext());
                current.setNext(e);

                amountOfElements++;
                // Damit wir nicht weiterloopen und Zeit vergeuden,
                // returnen wir einfach.
                return;
            }
            current = current.getNext();
        }
    }

    public void remove(ListElement<T> e)
    {
        ListElement<T> current = head;
        for(int i = 0; i <= amountOfElements; i++)
        {
            // Wenn das nächste Element das zu entfernende Element ist
            if(current.getNext() == e)
            {
                current.setNext(current.getNext().getNext());

                return;
            }
            current = current.getNext();
        }
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("Die Liste ist leer.");
            return;
        }

        ListElement<T> current = head;
        for(int i = 0; i < amountOfElements; i++)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}
