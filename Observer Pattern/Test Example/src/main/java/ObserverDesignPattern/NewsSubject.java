package ObserverDesignPattern;

public interface NewsSubject {
    public void notifyObservers();
    public void registerObserver(NewsObserver o);
    public void removeObservers(NewsObserver o);
}
