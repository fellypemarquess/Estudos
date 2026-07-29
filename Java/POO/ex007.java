package POO;
import POO.entities.Calculator;
import java.util.Scanner;

public class ex007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        System.out.printf("Área: %.2f\n", Calculator.area(raio));
        System.out.printf("Volume: %.2f\n", Calculator.volume(raio));
        System.out.printf("PI: %.2f\n",Calculator.PI);


        sc.close();
    }
}
