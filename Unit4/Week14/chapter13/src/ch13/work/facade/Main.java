package ch13.work.facade;

import java.util.ArrayList;

/**
 * Changes to the facade package:
 *
 * 1. Review classes in the Facade package and run the main() method.
 * 2. Use the sample code in the slides (or from the After section in the link above) to modify the Façade package so that
 *  1. The draw() methods of each shape prints a description of what is to be drawn.
 *  2. The square will be drawn at the smallest dimension (length or width);
 *  3. A circle will be drawn centered on the rectangle, and with a radius of the smallest dimension
 *  4. A new class for Line is accommodated;
 * 3. Add calls to the new façade class in the main() method.
 */

public class Main {

    public static void main(String[] args) {

        //ShapeMaker shapeMaker = new ShapeMaker();

        /*shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();*/


        Shape[] shapes = {
                new RectangleAdapter(new Rectangle()),
                new LineAdapter(new Line()),
                new SquareAdapter((new Square())),
                new CircleAdapter(new Circle())
        };

        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;

        for (Shape shape : shapes) {
            shape.draw(x1, y1, x2, y2);
        }
    }
}

