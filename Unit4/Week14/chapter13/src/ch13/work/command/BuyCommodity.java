package ch13.work.command;

public class BuyCommodity implements Order {
    private Commodity commodity;

    public BuyCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    @Override
    public void execute() {
        commodity.buy();
    }

    @Override
    public int getValue() {
        return commodity.getValue();
    }
}
