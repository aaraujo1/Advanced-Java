package ch13.work.command;

public class SellCommodity implements Order{
    private Commodity commodity;

    public SellCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    @Override
    public void execute() {
        commodity.sell();
    }

    @Override
    public int getValue() {
        return commodity.getValue() * -1;
    }


}
