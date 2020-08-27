package Homework5;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)  {

        Contact george = new Contact.Builder().setCompany(Company.Apple).setDepartment(Department.Factory)
                .setName("George").setEmail("george@Apple.com").setId(1).setPhone("111111").build();
        Contact john = new Contact.Builder().setDepartment(Department.Technical).setCompany(Company.Apple)
                .setName("john").setId(2).setPhone("222-222-222").setEmail("donald@Microsoft.com").build();
        Contact rebeca = new Contact.Builder().setEmail("rebeca@Apple.com").setCompany(Company.Apple).setName("rebeca")
                .setDepartment(Department.Support).setId(3).setPhone("3-3-3").build();
        Contact rob = new Contact.Builder().setCompany(Company.Intel).setDepartment(Department.Technical)
                .setEmail("rob@Intel.com").setName("Rey-rey").setId(4).setPhone("4-4-4").build();
        Contact ivar = new Contact.Builder().setPhone("5-5-5").setCompany(Company.Intel).setDepartment(Department.Factory)
                .setEmail("ivar@Intel.com").setId(3).setName("Ivar").build();
        Contact linus = new Contact.Builder().setCompany(Company.Intel).setDepartment(Department.Support)
                .setName("Linus").setId(6).setPhone("6-6-6").build();
        Contact rey = new Contact.Builder().setCompany(Company.Microsoft).setDepartment(Department.Technical)
                .setEmail("rey@Microsoft.com").setName("Rey-rey").setId(4).setPhone("77777").build();
        Contact donald = new Contact.Builder().setCompany(Company.Microsoft).setDepartment(Department.Factory)
                .setEmail("donald@Microsoft.com").setId(3).setPhone("88888").setName("donald").build();
        Contact eva = new Contact.Builder().setCompany(Company.Microsoft).setDepartment(Department.Support)
                .setName("eva").setId(6).setPhone("📱").setEmail("eva@Aple.com").build();

        DAO dao = new DAO();
        ArrayList<Contact> allContacts = dao.create( george, george, john, rebeca,
                                                    john, donald, eva, rey, linus, rob, ivar);
        dao.read();
        dao.update(george, Fields.Company, Company.Intel);
        dao.update(george, Fields.Company, "Intel");  // Prints the value should be Company class!

        dao.update(george, Fields.Phone, "303030303");
        dao.update(george, Fields.Phone, 234342);  //Prints Value should be String class!

        dao.update(george, Fields.Department, Department.Technical);
        dao.update(george, Fields.Department, "Manager"); // Value should be Department class!
        dao.read();
//        найти всі унікальні контакти
        List<Contact> unique = allContacts.stream()
                .distinct()
                .collect(Collectors.toList());
//  -знайти всі унікальні контакти з певного департаменту.
        List<Contact> appleUnique = allContacts.stream()
                .filter(cont -> cont.getCompany() == Company.Apple)
                .distinct()
                .collect(Collectors.toList());
//  -знайти всі унікальні контакти з певного департаменту
//  посортувавши їх по імейлу .
        ArrayList<Contact> collect = allContacts.stream()
                .filter(cont -> cont.getCompany() == Company.Apple)
                .distinct()
                .sorted(Comparator.comparing(Contact::getEmail))
                .collect(Collectors.toCollection(ArrayList::new));
//  -знайти всі унікальні контакти згрупувавши їх по компанії !!!!
        Map<Company, List<Contact>> byCompany = allContacts.stream()
                .distinct()
                .collect(Collectors.groupingBy(Contact::getCompany));
//        System.out.println(byCompany);
    }
}



