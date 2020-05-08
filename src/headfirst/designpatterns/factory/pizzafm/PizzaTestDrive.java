package headfirst.designpatterns.factory.pizzafm;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println(pizza.name);

    pizza = nyStore.orderPizza("sea");
    System.out.println(pizza.name);

    pizza = chicagoStore.orderPizza("clam");
    System.out.println(pizza.name);

    pizza = chicagoStore.orderPizza("sea");
    System.out.println(pizza.name);
  }
}
