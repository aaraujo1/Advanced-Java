package ch13.work.template;

public class ReadFromFile extends BookReader{
    private FileInput fileInput;
    @Override
    void initialize() {
        System.out.println("\n------ STARTING ReadFromFile ------\n");

        System.out.println("Open an input file");
        fileInput = new FileInput("out/production/chapter13/ch13/work/template/prideprejudice.txt");

    }

    @Override
    void startReading() {
        System.out.println("\n------ READING ReadFromFile ------\n");
        System.out.println("Loop writing out each record");


        String line;


        while ((line = fileInput.fileReadLine()) != null) {
            System.out.println(line);
        }


    }

    @Override
    void stopReading() {
        System.out.println("\n------ ENDING ReadFromFile ------\n");
        System.out.println("Close input file");
    }
}
