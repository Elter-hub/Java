package HomeWork3.part2;

public class Dog extends Pet {
    private int age = 5;

    public Dog() {
    }

    public Dog(int weight, int height, int age) {
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
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
