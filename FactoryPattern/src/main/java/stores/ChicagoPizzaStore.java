package stores;

import pizzas.chicago.ChicagoStyleCheesePizza;
import pizzas.chicago.ChicagoStyleClamPizza;
import pizzas.chicago.ChicagoStylePepperoniPizza;
import pizzas.chicago.ChicagoStyleVeggiePizza;
import pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
