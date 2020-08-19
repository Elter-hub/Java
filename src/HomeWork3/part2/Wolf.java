package HomeWork3.part2;

public class Wolf extends WildAnimal {
    private int age = 8;

    public Wolf() {
    }

    public Wolf(int weight, int height) {
        super(weight, height);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
