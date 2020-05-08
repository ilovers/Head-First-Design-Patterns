package headfirst.designpatterns.factory.pizzas;

public class Pizza {
  public String name;

  public void prepare() {
    System.out.println("prepare " + name);
  }

  public void bake() {
    System.out.println("bake pizza");
  }

  public void cut() {
    System.out.println("cut pizza");
  }

  public void box() {
    System.out.println("box pizza");
  }
}
