package Practice4.cars;

import java.util.Objects;

public class Engine {
    private String model;
    private double volume;
    private  int horsePowers;

    public Engine(String model, double volume, int horsePowers) {
        this.model = model;
        this.volume = volume;
        this.horsePowers = horsePowers;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.volume, volume) == 0 &&
                horsePowers == engine.horsePowers &&
                Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, volume, horsePowers);
    }

    @Override
    public String toString() {
        return "Engine" +
                "model " + model +
                ", volume " + volume +
                ", horsePowers" + horsePowers;
    }
}
