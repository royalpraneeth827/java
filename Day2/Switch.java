public class Switch {
    public static void main(String[] args) {
        String signal="red";
        switch(signal){
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("ready");
            case "green" -> System.out.println("go");
            default -> System.out.println("invalid signal");
        }
    }
}
