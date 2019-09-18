package ch13.work.facade;

public class Rectangle {
    /*@Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }*/

    public void draw(int x, int y, int width, int height) {
        System.out.println("Rectangle with coordinate left-down point (" + x + ", " + y + ") |  width: " + width
                + ", height: " + height + " | right-top point (" + (x+width)+ ", " + (y+height) + ")");
    }
}
