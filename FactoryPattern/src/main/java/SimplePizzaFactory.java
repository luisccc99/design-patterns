import pizzas.basic.CheesePizza;
import pizzas.basic.PepperoniPizza;
import pizzas.Pizza;
import pizzas.basic.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
