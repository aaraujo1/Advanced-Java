package ch13.work.facade;

/**
 * a circle will be drawn centered on the rectangle, and with a radius of the smallest dimension
 */

public class CircleAdapter implements Shape{

    private Circle adaptee;

    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    /*
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
     */
    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        //left coordinate
        int x = Math.min(x1, x2); //10
        int y = Math.min(y1, y2); //20

        int width = Math.abs(x2 - x1); //20
        int height = Math.abs(y2 - y1); //40

        //get middle coordinate
        int middleX = x + (width / 2);
        int middleY = y + (height / 2);


        int diameter = Math.min(width, height);
        int radius  = diameter / 2;


        adaptee.draw(middleX, middleY, radius);
    }
}
