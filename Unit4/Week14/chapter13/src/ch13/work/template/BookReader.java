package ch13.work.template;

public abstract class BookReader {

    abstract void initialize();

    abstract void startReading();
    abstract void stopReading();

    public final void readBook() {
        initialize();
        startReading();

        //flag to stop calling method
        if (!isInteractive()) {
            stopReading();
        }
    }

    public boolean isInteractive() {
        return false;
    }
}
