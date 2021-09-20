package stores;

import factories.SimplePizzaFactory;
import pizzas.ChicagoStyleCheesePizza;
import pizzas.ChicagoStyleVeggiePizza;
import pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza(type);
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza(type);
        } else {
            return null;
        }
    }
}
