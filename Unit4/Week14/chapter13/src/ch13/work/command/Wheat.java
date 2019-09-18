package ch13.work.command;

import java.text.NumberFormat;

public class Wheat implements Commodity {
    private String name = "wheat";
    private int price = 5;
    private int quantity = 2;
    private int value = quantity*price;

    private NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

    @Override
    public void buy() {
        System.out.println("Commodity [ Name: "+name+", Quantity: " + quantity +", Price: " + price + " ] bought at " + defaultFormat.format(value));
    }

    @Override
    public void sell() {
        System.out.println("Commodity [ Name: "+name+", Quantity: " + quantity +", Price: " + price + " ] sold at " + defaultFormat.format(value));
    }

    @Override
    public int getValue() {
        return value;
    }
}
