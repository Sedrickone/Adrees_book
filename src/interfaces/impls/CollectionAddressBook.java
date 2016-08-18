package interfaces.impls;

import interfaces.AddressBook;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import objects.Person;

import java.util.ArrayList;

/**
 * Created by ОБИ on 18.08.2016.
 */
public class CollectionAddressBook implements AddressBook {
    private ObservableList<Person> personList= FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void update(Person person) {
    //в коллекции не нужен
    }

    @Override
    public void delete(Person person) {personList.remove(person);
    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }
    public void fillTestData(){
        personList.add(new Person("Иван","321654"));
        personList.add(new Person("Бек","123434"));
        personList.add(new Person("Лёша","123545"));
        personList.add(new Person("Олег","355412"));
        personList.add(new Person("Машина","876644"));
        personList.add(new Person("Ростов","865433"));
        personList.add(new Person("Мага","3345654"));
    }

    public  void print(){
        int number=0;
        System.out.println();
        for (Person person:personList) {
            number++;
            System.out.println(number+") name = "+person.getFio()+"; phone = "+person.getPhone());
        }
    }
}
