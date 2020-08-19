package Practice3.part1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangular implements Area {
    double width;
    double height;

    @Override
    public double getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(30, 50);
        System.out.println(rectangular.getArea());
    }

}
