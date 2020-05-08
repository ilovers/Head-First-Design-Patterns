package headfirst.designpatterns.strategy.duck;

public class MallardDuck extends Duck {
  public MallardDuck() {
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("mallard duck displays.");
  }
}
