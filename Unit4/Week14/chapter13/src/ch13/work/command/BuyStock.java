package ch13.work.command;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }

    //THIS CLASS IS NOT NEEDED FOR THE LAB
    //THIS OVERRIDE METHOD IS HERE SIMPLY TO SATISFY THE NEW IMPLEMENTATION
    @Override
    public int getValue() {
        return 0;
    }

}