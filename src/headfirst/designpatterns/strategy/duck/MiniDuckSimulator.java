package headfirst.designpatterns.strategy.duck;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    QuackBehavior squeak = new Squeak();
    mallard.setQuackBehavior(squeak);

    mallard.performQuack();
  }
}
