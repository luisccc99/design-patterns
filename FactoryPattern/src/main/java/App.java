import pizzas.Pizza;
import stores.ChicagoPizzaStore;
import stores.NyPizzaStore;
import stores.PizzaStore;

public class App {

    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Someone ordered a " + pizza.getName() + '\n');

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Someone else ordered a " + pizza.getName() + '\n');

    }
}
