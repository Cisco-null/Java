import java.util.Scanner;


public class area{
    public  static void main(String[] args) {

         var sc = new Scanner(System.in);

        double a;
        double b;
        double c;
         double pi = 3.14159;

        double triangulo;
        double quadrado;
        double trapezio;
        double circulo;
        double retangulo;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        triangulo = a * c / 2;
        quadrado = b * 2;
        retangulo = a * b; 
        trapezio = (a + b) * c / 2;
        circulo = pi * c * c;
        


        System.out.printf("triangulo = %.3f \n quadrado = %.3f \n retangulo = %.3f \n trapezio = %.3f \n circulo = %.3f \n", triangulo, quadrado, retangulo, trapezio, circulo);
    }
}
        