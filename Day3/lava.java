class ATM{
    private int balance=500000;
    public void deposit(int amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Amont deposited succesfully");

        }else{
             System.out.println("invalid amount");
        }
    }
    public int getBalance(){
        return balance;

    }

}
public class lava {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.deposit(2000020);
        System.out.println("balance is:" + obj.getBalance());
    }
}
