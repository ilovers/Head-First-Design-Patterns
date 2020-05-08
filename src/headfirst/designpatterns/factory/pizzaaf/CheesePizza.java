package headfirst.designpatterns.factory.pizzaaf;

public class CheesePizza extends Pizza {
  public CheesePizza(PizzaIngredientFactory factory) {
    this.pizzaIngredientFactory = factory;
  }

  public void prepare() {
    this.dough = pizzaIngredientFactory.createDough();
    this.cheese = pizzaIngredientFactory.createCheese();
    this.clam = pizzaIngredientFactory.createClam();
  }
}
