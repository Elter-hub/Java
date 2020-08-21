package HomeWork4.computer;


import java.util.Objects;

public class HardDisc {
    String model;
    Ram typeOfRam;
    long capacity;
    Country country;

    public HardDisc() {
    }

    public HardDisc(String model, Ram typeOfRam, long capacity, Country country) {
        this.model = model;
        this.typeOfRam = typeOfRam;
        this.capacity = capacity;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Ram getTypeOfRam() {
        return typeOfRam;
    }

    public void setTypeOfRam(Ram typeOfRam) {
        this.typeOfRam = typeOfRam;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDisc hardDisc = (HardDisc) o;
        return capacity == hardDisc.capacity &&
                model.equals(hardDisc.model) &&
                typeOfRam == hardDisc.typeOfRam &&
                country == hardDisc.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, typeOfRam, capacity, country);
    }

    @Override
    public String toString() {
        return "HardDisc{" +
                "model='" + model + '\'' +
                ", typeOfRam=" + typeOfRam +
                ", capacity=" + capacity +
                ", country=" + country +
                '}';
    }
}


