package solid.example;

public class LiquidationStrategy implements BillDiscountStrategy {
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }

    @Override
    public String toString() {
        return "Liquidation";
    }
}
