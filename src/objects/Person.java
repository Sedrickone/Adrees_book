package objects;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by ОБИ on 18.08.2016.
 */
public class Person {

    private SimpleStringProperty fio=new SimpleStringProperty("");
    private SimpleStringProperty phone=new SimpleStringProperty("");

    public String getFio() {
        return fio.get();
    }

    public void setFio(String fio) {
        this.fio.set(fio);
    }

    public String getPhone() {
        return phone.get();
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public SimpleStringProperty fioProperty(){
        return fio;
    }
    public  SimpleStringProperty phoneProperty(){
        return  phone;
    }

    public Person() {
    }

    public Person(String fio, String phone) {
        this.fio=new SimpleStringProperty(fio);
        this.phone=new SimpleStringProperty(phone);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", phone='" + phone + '\'' +
                '}';

    }
}
