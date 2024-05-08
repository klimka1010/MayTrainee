package Comparable_and_Comparator;

import java.util.Comparator;

public class firstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());

    }
//    Comparator<Comparable_and_Comparator.Person> comparator = (o1, o2) -> o1.getName().compareTo(o2.getName());
}
