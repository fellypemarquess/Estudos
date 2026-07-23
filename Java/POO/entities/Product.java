package POO.entities;

public class Product {
    public String name;
    public double price;
    public int qtd;

    public double stockValue(){
        return price*qtd;
    }

    public void addProduct(int qtd){
        this.qtd += qtd;
    }

    public void removeProduct(int qtd){
        this.qtd -= qtd;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f",price) + ", " + qtd + " units, Total: $ " + String.format("%.2f", stockValue());
    }
}
