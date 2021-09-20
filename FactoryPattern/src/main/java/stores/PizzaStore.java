package stores;

import factories.SimplePizzaFactory;
import pizzas.Pizza;

public abstract class PizzaStore {
    private final SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    protected PizzaStore() {
        this.factory = null;
    }

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
