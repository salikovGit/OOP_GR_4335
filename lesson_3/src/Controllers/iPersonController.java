package Controllers;

import StudentDomain.Person;

public interface iPersonController<T extends Person> {

    /**
     * Method creates a person
     * @param firstName person's first name
     * @param lastName person's last name
     * @param age person's age
     */
    void create(String firstName, String lastName, int age);
}