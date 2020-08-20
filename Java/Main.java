import java.util.Scanner;


public class Main {

    public static void main( String[] args) {

        var sc = new Scanner(System.in);

        int x;
        int y;
        int z;

        x = sc.nextInt();
        y = sc.nextInt();
        z = x + y;

        System.out.printf( "Soma = %d,", z);

        sc.close();
        
    }

        
}