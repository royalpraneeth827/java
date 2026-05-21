class Grandfather {
    void Land(){
        System.out.println("Grandfather has land");
    }
}
class Father extends Grandfather{
    void bike(){
        System.out.println("Father has Bike");
    }
}
class Son extends Father{
    void laptop(){
        System.out.println("Son has laptop");
    }
}
public class d {
    public static void main(String[] args) {
        Son s=new Son();
        s.Land();
        s.bike();
        s.laptop();
    }
}
