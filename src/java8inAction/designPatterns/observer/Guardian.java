package java8inAction.designPatterns.observer;

public class Guardian implements Observer{
    @Override
    public void notify (String tweet){
        if ( tweet != null &&  tweet.contains("queen")){
            System.out.println("Yet another news in London... \n" + tweet);
        }
    }
}

