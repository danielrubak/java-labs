package lab1;

import java.util.Scanner;
import java.util.Locale;

public class Pasha {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int stickLength = scan.nextInt();

        if( stickLength%2 !=0 ){
            System.out.println("0");
        } else {
            if( stickLength%4 == 0 ) {
                System.out.println((stickLength/4)-1);
            }
            else {
                System.out.println(stickLength/4);
            }
        }
    }
}