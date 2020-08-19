package HomeWork3.part2;

class Animal {
    private int weight = 100;
    public Animal() {
    }

    public Animal(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                '}';
    }
}
