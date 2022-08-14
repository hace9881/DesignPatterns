package ObserverDesignPattern;

public class Logger implements Observer {
    private  Subject subject;
    private double temperature;
    private double windSpeed;
    private double pressure;

    public Logger(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }


    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        log();
    }

    public void log()
    {
        System.out.println( "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure);
    }

}
