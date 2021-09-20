public abstract class Pizza {

    String type;

    public Pizza(String type) {
        this.type = type;
    }

    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();

}
