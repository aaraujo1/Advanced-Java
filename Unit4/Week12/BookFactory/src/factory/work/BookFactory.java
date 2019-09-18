package factory.work;

/**
 * Step #3 - Create a Factory to generate object of concrete class based on given information.
 */

public class BookFactory {

    /**
     * Step #4 - Use the Factory to get object of concrete class by passing an information such as type.
     * @param bookType passing an information such as type
     * @return to get object of concrete class
     */
    public Book getBook(BookType bookType){
        switch (bookType){
            case FICTION: return new Fiction();
            case BIOGRAPHY: return new Biography();
            case GRAPHICNOVEL: return new GraphicNovel();
            default: return null;
        }
    }
}
