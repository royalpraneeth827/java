class ATM {
    private int balance = 500000;

    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }
}

public class N {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.deposit(200000);
        System.out.println("balance is:" + obj.getBalance());
    }
}