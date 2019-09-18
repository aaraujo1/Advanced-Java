package ch13.work.facade;

public class Square  {

    public void draw(int x, int y, int length) {
        System.out.println("Square with coordinate left-down point (" + x + ", " + y + ") | length of each side: " + length + " | right-top point (" + (x+length)+ ", " + (y+length) + ")"
                );
    }
}
