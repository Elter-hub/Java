package HomeWork3.part3;

public class WildAnimal extends Animal {
    int weight = 150;

    void hunt() {
        System.out.println("Run for the food");
    }

    public WildAnimal() {
    }

    public WildAnimal(int height, int weight) {
        super(height);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
