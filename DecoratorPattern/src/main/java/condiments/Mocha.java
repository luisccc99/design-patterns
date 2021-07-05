package condiments;

import beverages.Beverage;

public class Mocha extends CondimentDecorator {

    public static final double MOCHA_COST = .20;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + MOCHA_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
