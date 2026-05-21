
class Animal {
   void eat() {
      System.out.println("Animal is eating");
   }
}
class Dog extends Animal {
   void bark() {
      System.out.println("Dog is barking");
   }
}
class cat extends Animal {
   void meow() {
      System.out.println("cat is meowing");
   }
}


public class v {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
        cat c=new cat();
        c.eat();
        c.meow();
      }
    
}
