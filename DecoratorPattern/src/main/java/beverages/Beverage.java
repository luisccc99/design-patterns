package beverages;

public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI}

    Size size = Size.TALL;

    public String description = "Unknown description";

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
