class vehicle{
    String color = "red";

    public vehicle() {
        System.out.println("vehicle constructor called");
    }
    void display(){
        System.out.println("this is a vehicle class");
}
    }
    class car extends vehicle{
        String color = "blue";
        car(){
         System.out.println("car constructor called");   
        }
    
    void show(){
     System.out.println("parent color "+super.color);
     super.display();
     System.out.println("child color "+color);

    }
}
public class Eleven {
    public static void main(String[] args) {
        car c = new car();
        c.show();

    }
}
