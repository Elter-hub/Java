package Practice4;

public class Pet {
   private int width;
   private int height;
   private int age;
   private String name;

    @Override
    public String toString() {
        return "Pet " +
                ", age " + age +
                ", name '" + name;
    }

    public Pet(int width, int height, int age, String name) {
        this.width = width;
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
