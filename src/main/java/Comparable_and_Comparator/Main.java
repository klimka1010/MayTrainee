package Comparable_and_Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /////// Создание коллекции и заполнение данными ///////
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);

        for (int arr : list) {
            System.out.print(arr + " ");
        }

//        Используется метод sort() класса, от которого наслед. все коллекции
        Collections.sort(list);

        System.out.println(list);



        //////////////////// Сортировка коллекции COMPARABLE////////////////////
        /*
         * Создание списка
         * Для его заполнения привожу класс Arrays к Списку
         * и передаю ему только что созданные Экземпляры класса Comparable_and_Comparator.Person
         */
        List<Person> personList = Arrays.asList(
                new Person(31242334, "Klim", "Kutasov"),
                new Person(31263453, "Jeanne", "Kosyak")
        );

        Collections.sort(personList);

        for (Person arr : personList){
            System.out.println(arr + ";");
        }
        System.out.println();


        //////////////////// Сортировка коллекции COMPARATOR////////////////////
//        Collections.sort(new Comparable_and_Comparator.firstNameComparator());

//        Сортировка по имени
        personList.sort(new firstNameComparator());

//        Сортировка по имени и фамилии
        personList.sort(Comparator.comparing(Person::getName).thenComparing(Person::getLastName));


        for (Person arr : personList){
            System.out.println(arr + ";");
        }


    }
}
