package Practice4.cars;

import java.text.SimpleDateFormat;
import java.util.Objects;

public class Car {
    private String model;
    private int  year;
    private int  number;
    private String color;
    private Engine engine;
    private Wheel wheel;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, int year, int number, String color, Engine engine, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.engine = engine;
        this.wheel = wheel;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                number == car.number &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, number, engine, wheel);
    }

    @Override
    public String toString() {
        return "Car " +
                "model " + model +
                ", year=" + year +
                ", number " + number +
                ", engine=" + engine +
                " color " + color +
                ", wheel=" + wheel;
    }
}
