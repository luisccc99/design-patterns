package stores;

import pizzas.CaliforniaStyleCheesePizza;
import pizzas.CaliforniaStylePepperoniPizza;
import pizzas.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza(type);
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza(type);
        } else {
            return null;
        }
    }
}
