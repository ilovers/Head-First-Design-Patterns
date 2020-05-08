package headfirst.designpatterns.factory.pizzaaf;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String type) {
    PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
    Pizza pizza = null;
    if (type.equals("cheese")) {
      pizza = new CheesePizza(factory);
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(factory);
    }
    return pizza;
  }
}
