package Practice4.meteostation;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class MeteoStation extends java.util.Observable  {
    public String weather;
    private final List<Observer> peoples = new ArrayList<>();

    public void changeWeather(String newCondition){
        this.weather = newCondition;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer human) {
        peoples.add(human);
    }

    public void removeObserver(Observer human) {
        peoples.remove(human);
        System.out.println(human + " unsubscribed!");
    }

    @Override
    public void notifyObservers() {
        for (Observer human : peoples) {
            System.out.println(human + "The weather is : " + weather);
            human.update( this, weather);
        }
    }
}
