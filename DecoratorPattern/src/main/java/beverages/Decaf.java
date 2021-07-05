package beverages;

import beverages.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "beverages.Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
