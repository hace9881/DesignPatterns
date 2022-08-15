package ObserverDesignPattern;

public class ObserverPatternSimulation {
    public static void main(String[] args) {
        ConcreteWeatherStationSubject concreteWeatherStationSubject = new ConcreteWeatherStationSubject();
        ConcreteNewsSubject newsSubject = new ConcreteNewsSubject();

        Observer userInterface = new UserInterface(concreteWeatherStationSubject);
        Observer alert = new Alert(concreteWeatherStationSubject);
        Observer logger = new Logger(concreteWeatherStationSubject);
        concreteWeatherStationSubject.setTemperature(13.23);
        concreteWeatherStationSubject.setWindSpeed(12);
        concreteWeatherStationSubject.setPressure(50);
        concreteWeatherStationSubject.notifyObservers();

        Observer userInterFaceForNews = new UserInterface(newsSubject);
        newsSubject.setNews("This is normal news");
        newsSubject.setBreakingNews("This is breaking news");
        newsSubject.notifyObservers();
    }
}
