package models;

public class Person
{

    // --- Variables ---

    private String firstName;
    private String lastName;

    // --- Constructors ---

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // --- Getters / Setters ---

    // We allow getting the variables, but not setting them

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    // --- Functions ---

    public void printName()
    {
        System.out.println("Person: '" + getFirstName() + " " + getLastName() + "'");
    }
}
