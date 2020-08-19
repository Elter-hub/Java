package HomeWork3.part3;

public class Wolf extends WildAnimal {
    int age = 6;

    void sing(){
        System.out.println("Woooooooooo!");
    }

    public Wolf() {
    }

    public Wolf(int height, int weight, int age) {
        super(height, weight);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
