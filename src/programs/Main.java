package programs;

import models.Person;

public class Main
{

    public static void main(String[] args)
    {

        Person[] people = new Person[3];

        people[0] = new Person("John", "Nolan");
        people[1] = new Person("Markus", "Degen");
        people[2] = new Person("Padme", "Amidala");

        for(Person person : people)
        {
            person.printName();
        }

    }

}
