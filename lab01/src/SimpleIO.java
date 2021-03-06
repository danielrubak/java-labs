import java.util.Scanner;
import java.util.Locale;

/**
 * Testing of input/output
 */
public class SimpleIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        String s = scan.next();
        int i = scan.nextInt();
        double d = scan.nextDouble();
        System.out.printf(Locale.US, "Loaded %s , %d, %f", s, i, d);
    }
}