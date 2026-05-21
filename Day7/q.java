public class q {
    public static void main(String[] args) {
        try{
            String password=null;
            System.out.println(password.length());
        }
        catch(NullPointerException e){
            System.out.println("password cannot be empty");
        }
        finally{
    System.out.println("login process completed");
}
    }
}
