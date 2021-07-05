package condiments;

import beverages.Beverage;

public class Whip extends CondimentDecorator {

    public static final double WHIP_COST = .10;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + WHIP_COST;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
