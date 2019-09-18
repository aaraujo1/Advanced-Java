package factory.work;

/**
 * Step #2 - Create concrete classes implementing the
 * same interface.
 */

public class Biography implements Book{
    private String title;
    private boolean autobiography;

    public Biography(){
        title = "Che Guevara: A Revolutionary Life";
        autobiography = false;
    }

    @Override
    public void displayBook() {
        System.out.println(title + " is a " + (autobiography?"autobiography":"biography"));
    }
}
