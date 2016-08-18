package interfaces;

import objects.Person;

/**
 * Created by ОБИ on 18.08.2016.
 */
public interface AddressBook {
    //добавить запись
    void add(Person person);

    //внести измененные значения
    void update(Person person);

    //удалить запись
    void delete(Person person);

}
