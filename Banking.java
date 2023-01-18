import java.util.Scanner;

public class Banking {

    private final String NAME;
    private int balance;
    Scanner myObj = new Scanner(System.in);

    public Banking(String name, int balance) { this.NAME = name; this.balance = balance; }

    public void getBalance() {
        System.out.println("Current balance " + this.balance);
    }

    public void addMoney() {
        System.out.println("Enter value to add: ");
        int amount = myObj.nextInt();

        getBalance();
        this.balance += amount;
        System.out.println("add to balance " + amount);
        getBalance();
    }

    public void withDraw() {
        System.out.println("Enter value to withdraw: ");
        int amount = myObj.nextInt();
        getBalance();
        this.balance -= amount;
        System.out.println("withdraw from balance " + amount);
        getBalance();
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Banking vova = new Banking("Vova", 500);

        System.out.println("Hello, select what you want to do:");
        System.out.println("1. check balance");
        System.out.println("2. add money");
        System.out.println("3. withdraw money");
        System.out.println("4. exit");

        boolean sel = true;
        while (sel) {
            int select = myObj.nextInt();
            switch (select) {
                case 1 -> vova.getBalance();
                case 2 -> vova.addMoney();
                case 3 -> vova.withDraw();
                case 4 -> sel = false;
            }
        }
    }
}