import java.util.Scanner;


public class preco {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        
        int peca1;
        int peca2;
        int unidades1;
        int unidades2;
        float preco1;
        float preco2;

        float form;



        peca1 = sc.nextInt();
        unidades1 = sc.nextInt();
        preco1 = sc.nextFloat();

        peca2 = sc.nextInt();
        unidades2 = sc.nextInt();
        preco2 = sc.nextFloat();


        form = (preco1*unidades1) + (preco2*unidades2);

        System.out.printf("Valor a pagar: R$ %.2f", form); 
    }
}