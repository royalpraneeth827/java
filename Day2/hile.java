
public class hile {
    public static void main(String[] args) {
        int password=1234;
        int enteredpin=1233;
        while(enteredpin!=password){
            System.out.println("Incorrect pin, try again");
            enteredpin++;
        }
        System.out.println("Correct pin entered");
    }
    
}
