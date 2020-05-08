package headfirst.designpatterns.strategy.duck;

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("mute...");
  }
}
