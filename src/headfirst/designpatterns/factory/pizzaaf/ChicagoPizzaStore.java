package headfirst.designpatterns.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new CheesePizza(factory);
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(factory);
    }
    return pizza;
  }
}
