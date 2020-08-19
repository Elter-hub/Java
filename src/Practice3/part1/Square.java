package Practice3.part1;

public class Square implements Area{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public static void main(String[] args) {
        Square square = new Square(50);
        System.out.println(square.getArea());
    }
}
