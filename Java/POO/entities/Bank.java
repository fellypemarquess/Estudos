package POO.entities;

public class Bank {

    private final int account;
    private String name;
    private double cash;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void addCash(double deposite){
        this.cash += deposite;
    }

    public Bank(int account, String name, double cash) {
        this.account = account;
        this.name = name;
        addCash(cash);
    }

    public Bank(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public void removCash(double cash){
        this.cash -= (cash+5);
    }

    @Override
    public String toString() {
        return "\nBank Account: " +
                "account = " + account +
                ", name = " + name +
                ", cash = $ " + String.format("%.2f",cash);
    }
}
