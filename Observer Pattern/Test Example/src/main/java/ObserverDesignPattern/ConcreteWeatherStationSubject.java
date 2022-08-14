package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWeatherStationSubject implements Subject {
    List<Observer> observerList = new ArrayList<>();
    private double temperature;
    private double windSpeed;
    private double pressure;

    @Override
    public void notifyObservers() {
        for(Observer observer:observerList)
        {
            observer.update(temperature,windSpeed,pressure);
        }

    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
    observerList.remove(o);
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
