package pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public Pizza(String name) {
        this.name = name;
    }

    void prepare() {
        System.out.println("Preparing " + name + "...");
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("\t" + topping);
        }
    }
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public abstract void cut();
    public abstract void box();

}
