public abstract class Beverage {
    public String description = "Unknown description";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
