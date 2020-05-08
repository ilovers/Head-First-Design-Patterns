package headfirst.designpatterns.factory.pizzas;

public class PizzaTestDrive {
  public static void main(String[] args) {
    SimplePizzaFactory factory = new SimplePizzaFactory();
    PizzaStore store = new PizzaStore(factory);
    Pizza pizza = store.orderPizza("cheese");
    System.out.println(pizza.name);

    Pizza pizza1 = store.orderPizza("sea");
    System.out.println(pizza1.name);
  }
}
