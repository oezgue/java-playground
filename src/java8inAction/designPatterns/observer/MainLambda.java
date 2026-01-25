package java8inAction.designPatterns.observer;

public class MainLambda {
    public static void main(String[] args) {
    Feed feed = new Feed();

    feed.registerObserver(tweet -> {
        if (tweet != null && tweet.contains("intel")){
            System.out.println("Breaking News on INTEL");
        }
    });

    feed.notifyObservers("intel stock market crash!");

    }
}
