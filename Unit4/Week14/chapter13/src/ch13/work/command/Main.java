package ch13.work.command;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * 1. Download chapter13 work from Blackboard.
 * 2. Refactor the command pacakge to buy and sell commodities: Beans, Corn, Wheat.
 * 3. User a Factory design pattern to generate the three types of commodities;
 *      each commodity type initiates its daily price upon instantiation.
 * 4. Buy or Sell orders should include quantities and a way to calculate the value of the order
 * 5. When the orders are placed, the value of each order and total value should be displayed.
 */

public class Main {

    private static NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        /*Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();*/

        //start factory
        CommodityFactory commodityFactory = new CommodityFactory();

        //list to collect commodity object
        ArrayList<Order> orders = new ArrayList<>();

        //create orders of new commodity object made by the factory
        orders.add(new BuyCommodity(commodityFactory.getCommodity(CommodityType.BEANS)));
        orders.add(new SellCommodity(commodityFactory.getCommodity(CommodityType.CORN)));
        orders.add(new BuyCommodity(commodityFactory.getCommodity(CommodityType.WHEAT)));



        //new Command Invoker
        Broker broker = new Broker();

        //accept Order objects
        for (Order o:orders) {
            broker.takeOrder(o);
        }

        //place all orders
        broker.placeOrders();

        System.out.println("Total value of orders: " + defaultFormat.format(broker.getTotal()));
    }

}
