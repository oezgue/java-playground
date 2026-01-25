package java8inAction.designPatterns.observer;

public class NYTimes implements Observer{
     @Override
    public void notify (String tweet){
         if ( tweet != null &&  tweet.contains("money")){
             System.out.println("Breaking News in NY: \n" + tweet);
         }
     }
}
