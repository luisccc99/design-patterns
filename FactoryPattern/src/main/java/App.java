import stores.NyPizzaStore;

public class App {

    public static void main(String[] args) {
        NyPizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("cheese");
    }
}
