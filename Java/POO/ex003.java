package POO;
import POO.entities.Product;
import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int qtd = sc.nextInt();

        Product p1 = new Product(name,price,qtd);


        System.out.println("Product data: " + p1);
        System.out.print("Enter the number of products to add in Stock: ");
        qtd = sc.nextInt();
        p1.addProduct(qtd);
        System.out.println("Update data: " + p1);
        System.out.print("Enter the number of products to remove from Stock: ");
        int remov = sc.nextInt();
        p1.removeProduct(remov);
        System.out.println("Update data: " + p1);


        sc.close();
    }
}
