package Comparable_and_Comparator;

import java.util.Objects;


// имлементирую интерфейс Comparable - значит что объект Comparable_and_Comparator.Person можно сравнивать (comparable)
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String lastName;

    public Person(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }


//    Переопределил метод из интерфейса Comparable, параметрезированный тип: Comparable_and_Comparator.Person
    @Override
    public int compareTo(Person o) {
//        return Integer.compare(id, o.id);
//              или
        if (id == o.id) {
            return 0;
        } else if (id > o.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Comparable_and_Comparator.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName);
    }
}
