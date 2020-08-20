import java.util.Scanner;


public class salario {
    public static void main(String[] args) {
    
    var sc = new Scanner(System.in);

    int number;
    float valor_of_hour;
    float worked_hour;
    float form;

    number = sc.nextInt();
    valor_of_hour = sc.nextFloat();
    worked_hour = sc.nextFloat();




    form = valor_of_hour * worked_hour;

    System.out.printf("NUMBER =  %d\nSALARY = R$ %.2f", number, form);

    sc.close();

    }

}