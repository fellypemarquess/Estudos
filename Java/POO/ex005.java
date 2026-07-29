package POO;
import POO.entities.Employee;
import java.util.Scanner;

public class ex005 {
    public static void main(){
        Employee ep = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        ep.name = sc.nextLine();
        System.out.print("Sálario Bruto: ");
        ep.sal = sc.nextDouble();
        System.out.print("Taxa: ");
        ep.tax = sc.nextDouble();

        System.out.println();

        System.out.println(ep);

        System.out.println();

        System.out.print("Qual a porcentagem de aumento no salário? (Digite apenas o número): ");
        double porc = sc.nextDouble();
        ep.aumentoSal(porc);

        System.out.println();

        System.out.println(ep);

        sc.close();
    }
}
