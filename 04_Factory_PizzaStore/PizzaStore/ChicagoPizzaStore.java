package PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Käsepizza nach Chicago Art");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Vegetarische Pizza nach Chicago Art");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Muschelpizza nach Chicago Art");
 
		} else if (item.equals("pepperoni")) {
 
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Salami-Pizza nach Chicago Art");

		}
		return pizza;
	}
}
