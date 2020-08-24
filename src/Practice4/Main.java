package Practice4;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub1 = new ZooClub();
            // All pets 🐈 🐕
        Pet pet1 = new Pet(1, 1, 1, "111111");
        Pet pet2 = new Pet(2, 2, 2, "222222");
        Pet pet3 = new Pet(3, 3, 3, "333333");
        Pet pet4 = new Pet(4, 4, 4, "444444");
        Pet pet5 = new Pet(5, 5, 5, "55555555");
            //All persons 👨
        Person person1 = new Person("JOhn", 1, "Male");
        Person person2 = new Person("Jerry", 2, "Male");
        Person person3 = new Person("Joe", 3, "Female");
        Person person4 = new Person("Peter", 4, "Female");
        Person person5 = new Person("Vasya", 5, "Female");
        Person person6 = new Person("Ivan", 6, "Male");
            //Add people with empty ArrayList<Pet>
        zooClub1.addPerson(person1);
        zooClub1.addPerson(person3);
        zooClub1.addPerson(person2);
        zooClub1.addPerson(person5);
        zooClub1.addPerson(person4);
            //Fill ArrayLists with pets
        zooClub1.addPet(person1, pet1);
        zooClub1.addPet(person1, pet2);
        zooClub1.addPet(person1, pet4);

        zooClub1.addPet(person2, pet1);
        zooClub1.addPet(person2, pet2);
        zooClub1.addPet(person2, pet4);

            //Show whole map
        System.out.println("Whole map 🌎🌎🌎🌎");
        zooClub1.showZooClub();

            //remove specific pets from every Person
        System.out.println("Remove pets 🐕 ");
        System.out.println();
        zooClub1.removeFromEveryOne(pet2);
        zooClub1.removeFromEveryOne(pet4);
        System.out.println("Map without few pets 🗺🗺🗺🗺");
        zooClub1.showZooClub();
        System.out.println();

        System.out.println("Map without some people 🤼🤼🤼🤼");
        System.out.println();
        zooClub1.removeUser(person1);
        zooClub1.removeUser(person3);
        zooClub1.removeUser(person2);
        zooClub1.showZooClub();
    }
}
