package ch13.work.command;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }

    //THIS CLASS IS NOT NEEDED FOR THE LAB
    //THIS OVERRIDE METHOD IS HERE SIMPLY TO SATISFY THE NEW IMPLEMENTATION
    @Override
    public int getValue() {
        return 0;
    }
}
