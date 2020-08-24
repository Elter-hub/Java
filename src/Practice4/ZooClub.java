package Practice4;

import java.util.*;

public class ZooClub {
    private Map<Person, ArrayList<Pet>> mapa = new HashMap<>();

    public Map<Person, ArrayList<Pet>> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Person, ArrayList<Pet>> mapa) {
        this.mapa = mapa;
    }

    public void addPerson(Person person){
        mapa.put(person, new ArrayList<Pet>());
    }

    public void addPet(Person person, Pet pet){
        ArrayList<Pet> pets = mapa.get(person);
        pets.add(pet);
    }

    public void deletePet(Person person, Pet pet){
        ArrayList<Pet> pets = mapa.get(person);
        pets.remove(pet);
    }

    public void removeUser(Person person){
        mapa.remove(person);
    }

    public void removeFromEveryOne(Pet pet) {
        mapa.forEach((key, value) -> value.remove(pet));
    }

    public void showZooClub() {
        mapa.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
