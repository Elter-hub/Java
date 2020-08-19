package HomeWork3.part5;

import java.util.ArrayList;

class Class2 implements Creator{
    int length;
    int maximum;

    public Class2(int length, int maximum) {
        this.length = length;
        this.maximum = maximum;
        this.create(this.maximum);
    }

    @Override
    public ArrayList<Integer> create(int to) {
        return getIntegers(to, length);
    }

    static ArrayList<Integer> getIntegers(int to, int length) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < length; i++){
            integers.add((int) Math.round(Math.random() * to));
        }
        System.out.println(integers);
        return integers;
    }

    public static void main(String[] args) {
        Class2 class2 = new Class2(30, 1000);
    }
}
