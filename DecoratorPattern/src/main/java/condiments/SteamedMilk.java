package condiments;

import beverages.Beverage;

public class SteamedMilk extends CondimentDecorator {
    public static final double STEAMED_MILK_COST = .10;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + STEAMED_MILK_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
