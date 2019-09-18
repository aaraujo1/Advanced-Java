package ch13.work.facade;

public class Circle  {

    /*public void draw() {
        System.out.println("Circle::draw()");
    }*/
    public void draw(int x, int y, int radius) {
        System.out.println("Circle with center point (" + x + ", " + y + ")"
                + " | radius: " + radius);
    }
}