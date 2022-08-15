package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteNewsSubject implements NewsSubject{
    List<NewsObserver> newsObserverArrayList = new ArrayList<>();
    private String news;
    private String breakingNews;

    @Override
    public void notifyObservers() {
    for (NewsObserver observer:newsObserverArrayList)
    {
        observer.updateNews(news,breakingNews);
    }
    }

    @Override
    public void registerObserver(NewsObserver o) {
        newsObserverArrayList.add(o);
    }

    @Override
    public void removeObservers(NewsObserver o) {
        newsObserverArrayList.remove(o);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public void setBreakingNews(String breakingNews) {
        this.breakingNews = breakingNews;
    }
}
