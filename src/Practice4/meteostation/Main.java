package Practice4.meteostation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String weather = "Sunny";

        MeteoStation meteoStation = new MeteoStation();

        Human george = new Human("George");
        Human serhiy = new Human("Serhiy");
        Human ivan = new Human("Ivan");

        meteoStation.addObserver(george);
        meteoStation.addObserver(serhiy);
        meteoStation.addObserver(ivan);

        meteoStation.changeWeather(weather);

        Scanner scanner = new Scanner(System.in);
        weather = scanner.nextLine();

        meteoStation.changeWeather(weather);

        meteoStation.removeObserver(ivan);
    }
}
