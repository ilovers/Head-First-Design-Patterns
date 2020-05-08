package headfirst.designpatterns.strategy.duck;

public class FlyWithWings implements FlyBehavior {
  public void fly() {
    System.out.println("fly with wings");
  }
}
