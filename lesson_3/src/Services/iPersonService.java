package Services;

import java.util.List;

public interface iPersonService<T> {

    /**
     *
     * @return List of all objects created in this class
     */
    List<T> getAll();

    /**
     * Method creates an instance of class Person
     * @param firstName Person's first name
     * @param lastName Person's last name
     * @param age Person's age
     */
    void create(String firstName, String lastName, int age);

}