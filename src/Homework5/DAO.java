package Homework5;

import java.util.ArrayList;
import java.util.Arrays;

class DAO {
    ArrayList<Contact> database = new ArrayList<>();

    public DAO() {}

    public ArrayList<Contact> create(Contact... contact) {
        this.database.addAll(Arrays.asList(contact));
        return this.database;
    }

    public void read(){
        database.forEach(System.out::println);
    }

    public <T> void update(Contact contact, Fields field, T value) {
        database.stream()
                .filter(cont -> cont.equals(contact))
                .forEach(cont -> {
                    if (field == Fields.Company){
                        try {
                            cont.setCompany((Company) value);
                        }catch (ClassCastException e) {
                            System.out.println("Value should be Company class!");
                        }
                    }
                    if (field == Fields.Department){
                        try {
                            cont.setDepartment((Department) value);
                        }catch (ClassCastException e) {
                            System.out.println("Value should be Department class!");
                        }
                    }
                    if (field == Fields.Name || field == Fields.Email || field == Fields.Phone){
                        try {
                            if (field == Fields.Name) cont.setName((String) value);
                            if (field == Fields.Email) cont.setEmail((String) value);
                            if (field == Fields.Phone) cont.setPhone((String) value);
                        }catch (ClassCastException e) {
                            System.out.println("Value should be String class!");
                        }
                    }
                });
    }

    public void deleteContact(Contact... contacts){
        this.database.removeAll(Arrays.asList(contacts));
        Arrays.asList(contacts).forEach(contact -> System.out.println(contact.getName() + " was deleted❎"));
    }
}
