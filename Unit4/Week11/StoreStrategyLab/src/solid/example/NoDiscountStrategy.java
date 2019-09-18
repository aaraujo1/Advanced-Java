package solid.example;

public class NoDiscountStrategy implements BillDiscountStrategy{

    @Override
    public double getBillAmount(double billAmount) {
        return billAmount;
    }
    @Override
    public String toString() {
        return "No Discount";
    }
}
