package pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected final List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name + "...");
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        toppings.forEach(topping -> System.out.println("\t• " + topping));
    }
    public void bake() {
        System.out.println("Bake for 25 minutes at 350°...");
    }

    public void cut() {
        System.out.println("Cutting the pizza in diagonal slices...");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box...");
    }

    public String getName() {
        return name;
    }

}
