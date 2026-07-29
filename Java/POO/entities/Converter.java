package POO.entities;

public class Converter {

    public static final double TAX = 0.06;

    public static double calc(double priceD, double buy){
        double result = priceD*buy;
        return (result*TAX) + result;
    }
}
