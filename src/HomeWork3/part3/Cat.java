package HomeWork3.part3;

public class Cat extends Pet {
    int age = 4;

    void sound() {
        System.out.println("Meow");
    }

    @Override
    void live() {
        System.out.println("Eat, sleep, shit, fuck");
    }

    public Cat() {
    }

    public Cat(int height, int weight, int age) {
        super(height, weight);
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
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
