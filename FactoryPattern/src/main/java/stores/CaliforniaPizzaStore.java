package stores;

import pizzas.california.CaliforniaStyleCheesePizza;
import pizzas.california.CaliforniaStylePepperoniPizza;
import pizzas.Pizza;

public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
