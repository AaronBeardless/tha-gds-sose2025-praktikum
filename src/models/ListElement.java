package models;

/// # List Element
///
/// Ein Element in der Liste <br>
/// *Zur Einfachheit außerhalb der Listenklasse implementiert*
///
/// @param <T> Die Art des Elements
public class ListElement<T>
{

    // --- Variables ---

    /// Die tatsächlichen Daten des Elements
    private T data;
    /// Eine Referenz zum nächsten Element in der Liste
    /// (oder [null], wenn es das letzte Element ist)
    private ListElement<T> next;

    // --- Constructors ---

    public ListElement(T data)
    {
        this.data = data;
    }

    // --- Getters/Setters ---

    public ListElement<T> getNext()
    {
        return next;
    }

    public void setNext(ListElement<T> next)
    {
        this.next = next;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
