public class a {
    public static void main(String[] args) {
        try{
            int number=100/7;
            System.out.println(number);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divisible by zero");
        }
        finally{
            System.out.println("program completed");
        }
    }
}
