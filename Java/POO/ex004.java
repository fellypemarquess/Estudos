package POO;
import POO.entities.Rectangle;
import java.util.Scanner;
import java.util.Locale;

public class ex004 {
    public static void main() {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Rectangle a = new Rectangle();

        System.out.println("Digite os valores e veja os resultados para o retangulo");
        System.out.print("Digite o valor da largura: ");
        a.width = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        a.height = sc.nextDouble();

        System.out.printf("Área: %.2f\n",a.area());
        System.out.printf("Perimetro: %.2f\n",a.perimeter());
        System.out.printf("Diagonal: %.2f\n",a.diagonal());


        sc.close();
    }
}
