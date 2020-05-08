package headfirst.designpatterns.strategy.duck;

public class FlyNoWay implements FlyBehavior {
  public void fly() {
    System.out.println("fly no way!");
  }
}
