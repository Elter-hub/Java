package HomeWork3.part3;

public class Fox extends WildAnimal {
    int age = 12;

    void hide() {
        System.out.println("Not found");
    }

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
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
