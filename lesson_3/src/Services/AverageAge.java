package Services;

import StudentDomain.Person;

import java.util.List;

public class AverageAge {

    /**
     * Method prints average age of persons in given class
     * @param persons List of class objects
     * @param <T> Instance of class Person
     */
    static public <T extends Person> void avgAge(List<T> persons) {
        int sum = 0;

        for(T person: persons) {
            sum += person.getAge();
        }

        System.out.println("Средний возраст класса "
                + persons.get(0).getClass().getSimpleName() + " " + sum/persons.size());
    }
}
