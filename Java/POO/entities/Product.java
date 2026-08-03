package POO.entities;

public class Product {
    private String name;
    private double price;
    private int qtd;


    public Product(String name, double price, int qtd){
        this.name = name;
        this.price = price;
        this.qtd = qtd;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }


    public int getQtd(){
        return qtd;
    }

    public void setQtd(int qtd){
        this.qtd = qtd;
    }
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
