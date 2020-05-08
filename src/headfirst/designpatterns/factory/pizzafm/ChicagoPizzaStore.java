package headfirst.designpatterns.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new ChicagoCheesePizza();
    } else if (type.equals("clam")) {
      pizza = new ChicagoClamPizza();
    } else if (type.equals("sea")) {
      pizza = new ChicagoSeaPizza();
    } else if (type.equals("veggie")) {
      pizza = new ChicagoVeggiePizza();
    }
    return pizza;
  }
}
