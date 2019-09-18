package ch13.work.command;

public interface Order {
    void execute();
    int getValue();
}