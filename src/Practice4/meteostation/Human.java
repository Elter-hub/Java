package Practice4.meteostation;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class Human implements Observer {
    private String name;
    private Set<String> forecast = new HashSet<>();

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void checkWeather(String checkWeather){
        System.out.println(name + " checks weather. The weather is going to be " + checkWeather + "!!!");
        forecast.add(checkWeather);
    }

    @Override
    public void update(Observable observable, Object o) {
        checkWeather(o.toString());
    }

    @Override
    public String toString() {
        return "Notification for " + name + " ";
    }
}
