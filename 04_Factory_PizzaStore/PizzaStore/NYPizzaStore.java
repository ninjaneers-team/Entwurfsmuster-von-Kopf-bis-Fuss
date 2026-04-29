package PizzaStore;


public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Käsepizza nach New Yorker Art");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Vegetarische Pizza nach New Yorker Art");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Muschelpizza nach New Yorker Art");
 
		} else if (item.equals("pepperoni")) {
 
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Salami-Pizza nach New Yorker Art");
 
		} 
		return pizza;
	}
}
