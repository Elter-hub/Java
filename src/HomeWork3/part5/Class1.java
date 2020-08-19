package HomeWork3.part5;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

import static HomeWork3.part5.Class2.getIntegers;

@NoArgsConstructor
class Class1 implements Creator {

    int length;
    final int to = 200;  //

    public Class1(int length) {
        this.length = length;
        this.create(this.to);
    }

    @Override
    public ArrayList<Integer> create(int to) {
        return getIntegers(to, length);
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1(20);
    }
}
