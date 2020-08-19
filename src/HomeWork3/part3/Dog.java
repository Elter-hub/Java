package HomeWork3.part3;

public class Dog extends Pet {
    private int age = 5;

    void bark() {
        System.out.println("Wof wof");
    }


    public Dog() {
    }

    public Dog(int height, int weight, int age) {
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
        return "Dog{" +
                "age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
