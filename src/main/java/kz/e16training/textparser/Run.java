package kz.e16training.textparser;

/**
 * @author DK
 * @version 1.0.0
 *
 */
public class Run {
    public static void main(String[] args) {
        Book book = new Book("stl.txt", "UTF8");
        System.out.println(book.toStringAsCollection());
    }
}
