class BankAccount{   
    private int pin = 1903;
    void showpin(){
        System.out.println("the gokul pin is "+pin);
    }
}


public class Main {
    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.showpin();
       
    }
    
}
