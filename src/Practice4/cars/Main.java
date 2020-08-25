package Practice4.cars;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("chevrolet chevelle malibu", 1970, 1, "red",
                new Engine("A1", 2.0, 130),
                new Wheel("USA", 20));
        Car car2 = new Car("ford torino", 1999, 2, "blue",
                new Engine("A2", 2.3, 140),
                new Wheel("CHina", 21));
        Car car3 = new Car("pontiac catalina", 2011, 3, "Black",
                new Engine("A3", 3.0, 180),
                new Wheel("Ukraine", 24));
        Car car4 = new Car("dodge challenger se", 2015, 4, "White",
                new Engine("A4", 1.0, 80),
                new Wheel("Canada", 15));
        Car car5 = new Car("amc hornet", 2020, 5, "Brown",
                new Engine("A5", 2.4, 140),
                new Wheel("Chille", 12));
        Car car6 = new Car("volkswagen super beetle", 2017, 6, "Yellow",
                new Engine("A6", 1.6, 160),
                new Wheel("Japan", 16));

        ArrayList<Car> allCars = Arrays.stream(new Car[]{car1, car2, car3, car4, car5, car6})
                .sorted(Comparator.comparing(Car::getYear).reversed())
                .collect(Collectors.toCollection(ArrayList::new));

        Consumer<ArrayList<Car>> increaseDiameterBy1OlderThan2000 = cars -> allCars.stream()
                .filter(car -> car.getYear() < 2000)
                .forEach(car -> {
                    car.getWheel().setDiameter(car.getWheel().getDiameter() + 100);
                    car.setColor("Green");
                });

        increaseDiameterBy1OlderThan2000.accept(allCars);

        ArrayList<Car> olderSortByYearInc = allCars.stream()
                .filter(car -> car.getYear() < 2000)
                .sorted(Comparator.comparing(Car::getYear))
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Car> youngerSortByYearDec = allCars.stream()
                .filter(car -> car.getYear() > 2000)
                .sorted(Comparator.comparing(Car::getYear).reversed())
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(olderSortByYearInc);
        System.out.println();
        System.out.println(youngerSortByYearDec);
        System.out.println();

        List<ArrayList<Car>> combineCars = Stream.of(olderSortByYearInc, youngerSortByYearDec)
                .collect(Collectors.toList());
        System.out.println(combineCars);
    }
}
