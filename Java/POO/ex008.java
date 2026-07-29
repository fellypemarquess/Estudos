package POO;
import java.util.Scanner;
import POO.entities.Converter;

public class ex008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dolar? ");
        double priceD = sc.nextDouble();

        System.out.print("Quantos dolares você vai comprar? ");
        double buy = sc.nextDouble();

        System.out.printf("A quantidade em reais a ser paga: R$ %.2f", Converter.calc(priceD, buy));

        sc.close();
    }
}
