package ch13.work.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    private int total = 0;

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
            total += order.getValue();
        }
        orderList.clear();
    }

    public int getTotal(){
        return total;
    }
}
