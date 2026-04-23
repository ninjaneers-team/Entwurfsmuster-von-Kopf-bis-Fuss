public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", Milchschaum";
    }
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
