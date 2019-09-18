package factory.work;

/**
 * Step #2 - Create concrete classes implementing the
 * same interface.
 */

public class GraphicNovel implements Book{
    private String title;
    private String author;
    private String illustrator;


    public GraphicNovel(){
        author = "Brian K. Vaughan";
        illustrator = "Pia Guerra and Jose Marzan Jr.";
        title = "Y: The Last Man Book One";
    }

    @Override
    public void displayBook() {
        System.out.println(title + " is written by " + author + " and illustrated by " + illustrator);
    }
}
