package ObserverDesignPattern;

public class UserInterface implements Observer{
    private  Subject subject;
    private double temperature;
    private double windSpeed;
    private double pressure;

    public UserInterface(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }

    public void display()
    {
        System.out.println( "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure);
    }

}
