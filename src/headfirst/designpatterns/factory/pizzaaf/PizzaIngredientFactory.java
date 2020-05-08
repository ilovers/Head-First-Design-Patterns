package headfirst.designpatterns.factory.pizzaaf;

interface PizzaIngredientFactory {
  Dough createDough();

  Cheese createCheese();

  Clam createClam();
}
