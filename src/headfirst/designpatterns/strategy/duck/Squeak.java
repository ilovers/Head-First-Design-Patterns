package headfirst.designpatterns.strategy.duck;

public class Squeak implements QuackBehavior {
  public void quack() {
    System.out.println("squeak squeak squeak");
  }
}
