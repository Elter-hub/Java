package HomeWork3.part2;

public class Fox extends WildAnimal {
    private int age = 12;

    public Fox() {
    }

    public Fox(int weight, int height, int age) {
        super(weight, height);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}
