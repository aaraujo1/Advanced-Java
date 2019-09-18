package solid.example;

public class DiscountStrategy implements BillDiscountStrategy {
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }

    @Override
    public String toString() {
        return "Discount";
    }
}
