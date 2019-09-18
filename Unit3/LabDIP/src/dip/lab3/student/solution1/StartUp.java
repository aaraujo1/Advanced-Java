package dip.lab3.student.solution1;

public class StartUp {
    public static void main(String[] args) {

        //for input
        Reader r1 = new ConsoleReader();
        Reader r2 = new GuiReader();

        //for output
        Writer w1 = new ConsoleWriter();
        Writer w2 = new GuiWriter();

        //console to console
        MessageService messageService1 = new MessageService(r1, w1);
        messageService1.MessagingSystem();

        //gui to gui
        MessageService messageService2 = new MessageService(r2, w2);
        messageService2.MessagingSystem();

        //gui to console
        MessageService messageService3 = new MessageService(r2, w1);
        messageService3.MessagingSystem();

        //console to gui
        MessageService messageService4 = new MessageService(r1, w2);
        messageService4.MessagingSystem();

    }
}
