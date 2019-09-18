package ch13.work.template;

public class ReadFromArray extends BookReader{
    private Franky theBook;

    @Override
    void initialize() {
        System.out.println("\n------ STARTING ReadFromArray ------\n");
        theBook = new Franky();
    }

    @Override
    void startReading() {
        System.out.println("\n------ READING ReadFromArray ------\n");
        theBook.outputBook();
    }

    @Override
    void stopReading() {
        System.out.println("\n------ ENDING ReadFromArray ------\n");
    }
}