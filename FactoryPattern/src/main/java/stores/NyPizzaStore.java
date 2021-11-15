package stores;

import pizzas.newyork.NyStyleCheesePizza;
import pizzas.newyork.NyStyleClamPizza;
import pizzas.newyork.NyStylePepperoniPizza;
import pizzas.newyork.NyStyleVeggiePizza;
import pizzas.Pizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NyStyleCheesePizza();
            case "veggie" -> new NyStyleVeggiePizza();
            case "clam" -> new NyStyleClamPizza();
            case "pepperoni" -> new NyStylePepperoniPizza();
            default -> null;
        };
    }
}
