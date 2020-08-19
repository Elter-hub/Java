package HomeWork3.part3;

class Animal {
    int height = 100;

    void live() {
        System.out.println("Hunt, eat, sleep, shit, fuck");
    }

    public Animal() {
    }

    public Animal(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "height=" + height +
                '}';
    }
}
