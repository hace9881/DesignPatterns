package ObserverDesignPattern;

public class ObserverPatternSimulation {
    public static void main(String[] args) {
        ConcreteWeatherStationSubject concreteWeatherStationSubject = new ConcreteWeatherStationSubject();
        Observer userInterface = new UserInterface(concreteWeatherStationSubject);
        Observer alert = new Alert(concreteWeatherStationSubject);
        Observer logger = new Logger(concreteWeatherStationSubject);
        concreteWeatherStationSubject.setTemperature(13.23);
        concreteWeatherStationSubject.setWindSpeed(12);
        concreteWeatherStationSubject.setPressure(50);
        concreteWeatherStationSubject.notifyObservers();
    }
}
