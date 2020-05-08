package headfirst.designpatterns.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new NYCheesePizza();
    } else if (type.equals("clam")) {
      pizza = new NYClamPizza();
    } else if (type.equals("sea")) {
      pizza = new NYSeaPizza();
    } else if (type.equals("veggie")) {
      pizza = new NYVeggiePizza();
    }
    return pizza;
  }
}
