package HomeWork3.part3;

public class Pet extends Animal {
    int weight = 25;

    void run() {
        System.out.println("top top top");
    }

    public Pet() {
    }

    public Pet(int height, int weight) {
        super(height);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
