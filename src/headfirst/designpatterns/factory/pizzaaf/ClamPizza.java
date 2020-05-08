package headfirst.designpatterns.factory.pizzaaf;

public class ClamPizza extends Pizza {
  public ClamPizza(PizzaIngredientFactory factory) {
    this.pizzaIngredientFactory = factory;
  }

  public void prepare() {
    this.dough = pizzaIngredientFactory.createDough();
    this.cheese = pizzaIngredientFactory.createCheese();
    this.clam = pizzaIngredientFactory.createClam();
  }
}
