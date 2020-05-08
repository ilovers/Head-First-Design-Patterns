package headfirst.designpatterns.factory.pizzaaf;

public abstract class Pizza {
  public String name;
  public Dough dough;
  public Cheese cheese;
  public Clam clam;
  public PizzaIngredientFactory pizzaIngredientFactory;

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
