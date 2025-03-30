import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Subscriber {
    void update(String news);
}

// Concrete Observer 1: Mobile App
class MobileApp implements Subscriber {
    private final String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}

// Concrete Observer 2: Website
class Website implements Subscriber {
    private final String name;

    public Website(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " updated with news: " + news);
    }
}

// Concrete Observer 3: TV Channel
class TVChannel implements Subscriber {
    private final String name;

    public TVChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " broadcasting: " + news);
    }
}

// Subject Interface
interface NewsAgency {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String news);
}

// Concrete Subject
class NewsAgencyImpl implements NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}

// Client Code
public class Main {
    public static void main(String[] args) {
        NewsAgencyImpl newsAgency = new NewsAgencyImpl();

        Subscriber app = new MobileApp("NewsApp");
        Subscriber website = new Website("NewsWebsite");
        Subscriber tvChannel = new TVChannel("NewsChannel");

        newsAgency.subscribe(app);
        newsAgency.subscribe(website);
        newsAgency.subscribe(tvChannel);

        newsAgency.notifySubscribers("Breaking News: Observer Pattern Implemented Successfully!");

        newsAgency.unsubscribe(website);

        newsAgency.notifySubscribers("Update: Observer Pattern Example Completed.");
    }
}
