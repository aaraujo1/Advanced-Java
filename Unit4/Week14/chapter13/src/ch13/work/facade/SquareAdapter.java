package ch13.work.facade;

public class SquareAdapter implements Shape{
    private Square adaptee;

    public SquareAdapter(Square square) {
        this.adaptee = square;
    }

    /*
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int x = Math.min(x1, x2); //10
        int y = Math.min(y1, y2); //20

        int width = Math.abs(x2 - x1); //20
        int height = Math.abs(y2 - y1); //40

        int length = Math.min(width, height);

        adaptee.draw(x, y, length);
    }
}
