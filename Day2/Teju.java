class Employee{
    String name;
    Employee(String n){
        name = n;
    }
    void display(){
        System.out.println(name);
    }
}


public class Teju {
    public static void main(String[] args) {
        Employee e = new Employee("Vetrivel");
        e.display();
    }   
}
