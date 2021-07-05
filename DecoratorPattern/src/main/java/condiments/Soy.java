package condiments;

import beverages.Beverage;

public class Soy extends CondimentDecorator {
    public static final double SOY_COST = .15;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double plus = 0.0;
        switch (beverage.getSize()) {
            case TALL:
                plus = .10;
                break;
            case GRANDE:
                plus = .15;
                break;
            case VENTI:
                plus = .20;
                break;
            default:
                plus = SOY_COST;
                break;
        }
        return beverage.cost() + plus;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
