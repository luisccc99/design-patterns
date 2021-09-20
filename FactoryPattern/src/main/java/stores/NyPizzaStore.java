package stores;

import pizzas.NyStyleCheesePizza;
import pizzas.NyStyleVeggiePizza;
import pizzas.Pizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStyleCheesePizza(type);
        } else if (type.equals("veggie")) {
            return new NyStyleVeggiePizza(type);
        } else {
            return null;
        }
    }
}
