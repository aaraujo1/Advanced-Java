package factory.work;

/**
 * Step #2 - Create concrete classes implementing the
 * same interface.
 */

public class Fiction implements Book{
    private String title;

    public Fiction(){
        title = "A Case of Need: A Novel";
    }

    @Override
    public void displayBook() {
        System.out.println(title);
    }
}
