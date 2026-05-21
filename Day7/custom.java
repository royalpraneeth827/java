class LowBalanceException extends Exception{
    LowBalanceException(String message){
        super(message);
    }

    public static void main(String[] args) {
        int balance=500;
        try{
            if(balance<1000){
                throw new LowBalanceException("Balance is less than 1000");
            }
            System.out.println("Transaction Successfull");
        }
        catch(LowBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}
