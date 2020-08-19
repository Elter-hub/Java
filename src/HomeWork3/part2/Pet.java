package HomeWork3.part2;

public class Pet extends Animal {
    private int height = 80;

    public Pet() {
    }

    public Pet(int weight, int height) {
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
        return "Pet{" +
                "height=" + height +
                '}';
    }
}
