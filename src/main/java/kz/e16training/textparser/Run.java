package kz.e16training.textparser;

/**
 * @author DK
 * @vesion 1.0.0
 *
 */
public class Run {
    public static void main(String[] args) {
        Parser parser = new Parser("stl.txt", "UTF8");
        parser.start();
    }
}
