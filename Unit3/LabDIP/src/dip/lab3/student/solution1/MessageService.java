package dip.lab3.student.solution1;

public class MessageService {
    private Reader readerService;
    private Writer writerService;

    public MessageService(Reader reader, Writer writer){
        setReaderService(reader);
        setWriterService(writer);
    }


    public Reader getReaderService() {
        return readerService;
    }

    public void setReaderService(Reader readerService) {
        this.readerService = readerService;
    }

    public Writer getWriterService() {
        return writerService;
    }

    public void setWriterService(Writer writerService) {
        this.writerService = writerService;
    }

    public void MessagingSystem(){
        /*String s = readerService.getMessage();
        writerService.setMessage(s);*/
        writerService.setMessage(readerService.getMessage());
    }
}
