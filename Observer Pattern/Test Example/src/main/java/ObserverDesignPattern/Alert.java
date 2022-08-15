package ObserverDesignPattern;

public class Alert implements Observer,NewsObserver {
    private Subject subject;
    private double temperature;
    private double windSpeed;
    private double pressure;

    public Alert(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        alert();
    }

    @Override
    public void updateNews(String news, String breakingNews) {

    }

    public void alert()
    {
        System.out.println( "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure);
    }

}
