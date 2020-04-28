package headfirst.designpatterns.strategy;

public class RubberDuck extends Duck {
  public RubberDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  public void display() {
    System.out.println("rubber duck displays.");
  }
}
