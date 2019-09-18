package solid.example;

public class SaleStrategyBill implements BillDiscountStrategy {
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }

    @Override
    public String toString() {
        return "Sale";
    }
}
