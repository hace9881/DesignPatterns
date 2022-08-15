package ObserverDesignPattern;

public class UserInterface implements Observer,NewsObserver{
    private  Subject subject;
    private  NewsSubject newsSubject;
    private double temperature;
    private double windSpeed;
    private double pressure;
    private String news;
    private String breakingNews;

    public UserInterface(NewsSubject newsSubject) {
        this.newsSubject = newsSubject;
        if(newsSubject!=null)
        {
            newsSubject.registerObserver(this);
        }

    }

    public UserInterface(Subject subject) {
        this.subject = subject;
        if(subject!=null)
        {
            subject.registerObserver(this);
        }

    }

    @Override
    public void update(double temperature, double windSpeed, double pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }

    @Override
    public void updateNews(String news, String breakingNews) {
        this.news = news;
        this.breakingNews=breakingNews;
        displayNews();

    }

    private void displayNews() {
        System.out.println( "news=" + news +
                ", breakingNews=" + breakingNews);
    }

    public void display()
    {
        System.out.println( "temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                ", pressure=" + pressure);
    }

}
