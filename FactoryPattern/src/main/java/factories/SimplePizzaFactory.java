package factories;

import pizzas.CheesePizza;
import pizzas.PepperoniPizza;
import pizzas.Pizza;
import pizzas.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(type);
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(type);
                break;
            case "veggie":
                pizza = new VeggiePizza(type);
                break;
        }
        return pizza;
    }
}
