package HomeWork3.part2;

public class WildAnimal extends Animal {
    int height = 100;

    public WildAnimal() {
    }

    public WildAnimal(int weight, int height) {
        super(weight);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "height=" + height +
                '}';
    }
}
