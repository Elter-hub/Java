package HomeWork3.part2;

public class Cat extends Pet {
    int age = 3;

    public Cat() {
    }

    public Cat(int weight, int height, int age) {
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
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
