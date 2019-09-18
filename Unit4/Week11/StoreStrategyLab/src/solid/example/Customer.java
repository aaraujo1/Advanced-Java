package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    //private char discountType;
    private BillDiscountStrategy billDiscountStrategy;
    private double newBillAmount;


    public Customer(String customerName, double billAmount, char discountType) {
        /*this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;*/

        this.setCustomerName(customerName);
        this.setBillAmount(billAmount);
        this.setBillDiscountStrategy(discountType);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /*public double getBillAmount() {
        double tempBill;
        switch(discountType) {
            case 'S':
            case 's': tempBill = billAmount - (billAmount * 0.1);
            case 'D':
            case 'd': tempBill = billAmount - (billAmount * 0.5);
            case 'L':
            case 'l': tempBill = billAmount - (billAmount * 0.75);
            default: tempBill = billAmount;
        }
        return tempBill;
    }*/

    public double getBillAmount(){
        return billAmount;
    }

    public double getNewBillAmount(){
        return this.billDiscountStrategy.getBillAmount(billAmount);
    }

    public void setNewBillAmount(){
        newBillAmount =  this.billDiscountStrategy.getBillAmount(billAmount);
    }

    public BillDiscountStrategy getBillDiscountStrategy() {
        return billDiscountStrategy;
    }

    public void setBillDiscountStrategy(char discountType) {
        //double tempBill;
        BillDiscountStrategy b;
        switch(discountType) {
            case 'S':
            case 's': b = new SaleStrategyBill(); break;
            case 'D':
            case 'd': b = new DiscountStrategy(); break;
            case 'L':
            case 'l': b = new LiquidationStrategy(); break;
            default: b = new NoDiscountStrategy();
        }
        this.billDiscountStrategy = b;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        /*return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", billAmount=" + billAmount +
                ", discountType=" + discountType +
                '}';*/
        return "Customer{" +
                "customerName='" + getCustomerName() + '\'' +
                ", billAmount=" + getBillAmount() +
                ", discountType=" + getBillDiscountStrategy().toString() +
                ", newBillAmount=" + getNewBillAmount() +
                '}';
    }
}
