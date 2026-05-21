class Student{
    String name;
    Student(String name){
        this.name=name;
    }
    void show(){
        System.out.println("Student name:"+name);
    }
}


public class b {
    public static void main(String[] args) {
        Student s = new Student("Gokul");
        s.show();
    }
}
