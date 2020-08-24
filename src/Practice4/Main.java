package Practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub1 = new ZooClub(new HashMap<>());
        // All pets 🐈 🐕
        Pet pet1 = new Pet(1, 1, 1, "111111");
        Pet pet2 = new Pet(2, 2, 2, "222222");
        Pet pet3 = new Pet(3, 3, 3, "333333");
        Pet pet4 = new Pet(4, 4, 4, "444444");
        Pet pet5 = new Pet(5, 5, 5, "55555555");
        //All persons 👨
        addPerson(zooClub1, new Person("JOhn", 1, "Male"));
        addPerson(zooClub1, new Person("Jerry", 2, "Male"));
        addPerson(zooClub1, new Person("Joy", 3, "Female"));
        addPerson(zooClub1, new Person("Julia", 4, "Female"));
        addPerson(zooClub1, new Person("Vasya", 5, "Female"));
        addPerson(zooClub1, new Person("Ivan", 6, "Male"));
        //Add people with empty ArrayList<Pet>

        showMap(zooClub1);
        addPets(zooClub1, "Ivan", pet3);
        addPets(zooClub1, "John", pet1, pet2, pet3);
        addPets(zooClub1, "vasya", pet1, pet3);
        addPets(zooClub1, "Julia", pet1, pet2, pet3);
        addPets(zooClub1, "joy", pet2, pet4);
        addPets(zooClub1, "Jerry", pet3, pet1, pet3);
        showMap(zooClub1);

        removePetFromPerson(zooClub1, "Jerry", pet1, pet3 );
        removePetFromPerson(zooClub1, "joy", pet2, pet4 );
        showMap(zooClub1);

        removePetFromEveryOne(zooClub1, pet1);
        showMap(zooClub1);
        removePerson(zooClub1, "JOY");
        removePerson(zooClub1, "jerry");
        removePerson(zooClub1, "vasya");
        removePerson(zooClub1, "ivan");
        System.out.println("__________________");
        showMap(zooClub1);


    }

    static void addPerson(ZooClub club, Person person){
        club.getMapa().put(person, new ArrayList<Pet>());
    }

    static void removePerson(ZooClub club, String personName){
        club.getMapa().keySet().removeIf(person -> person.getName().equalsIgnoreCase(personName));
    }

    static void addPets(ZooClub club, String personName, Pet... pet){
        club.getMapa().entrySet().stream()
                .filter(person -> person.getKey().getName().equalsIgnoreCase(personName))
                .forEach(person -> person.getValue().addAll(Arrays.asList(pet)));
    }

    static void removePetFromPerson(ZooClub club, String personName, Pet... pet){
        club.getMapa().entrySet().stream()
                .filter(person -> person.getKey().getName().equalsIgnoreCase(personName))
                .forEach(person -> person.getValue().removeAll(Arrays.asList(pet)));
    }

    static void removePetFromEveryOne(ZooClub club,  Pet... pet){
        club.getMapa().forEach((key, value) -> value.removeAll(Arrays.asList(pet)));
    }

    static void showMap(ZooClub zooClub) {
        zooClub.getMapa().entrySet().forEach(System.out::println);
    }
}
