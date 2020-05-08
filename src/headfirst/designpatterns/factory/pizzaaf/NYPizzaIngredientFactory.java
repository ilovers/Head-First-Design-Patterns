package headfirst.designpatterns.factory.pizzaaf;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  public Dough createDough() {
    return new ThickCrustDough();
  }

  public Cheese createCheese() {
    return new BigCheese();
  }

  public Clam createClam() {
    return new BigClam();
  }
}
