package Practice4.cars;

import java.util.Objects;

public class Wheel {
    private String producer;
    private int diameter;

    public Wheel(String producer, int diameter) {
        this.producer = producer;
        this.diameter = diameter;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                Objects.equals(producer, wheel.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, diameter);
    }

    @Override
    public String toString() {
        return "Wheel " +
                "producer " + producer +
                ", diameter=" + diameter ;
    }
}
