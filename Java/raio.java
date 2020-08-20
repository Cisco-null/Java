import java.util.Scanner;
import java.util.Locale;


public class raio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        var sc = new Scanner(System.in);

         final double R, A, pi = 3.14159;
        
        R = sc.nextDouble();

        A = pi * R * R;


        System.out.printf( "A=%.4f%n", A);

        sc.close();

    }
}