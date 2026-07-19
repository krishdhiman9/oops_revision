package abstraction;
//abstract class Animal {
//
//    // Abstract Method
//    abstract void sound();
//
//    // Normal Method
//    void eat() {
//        System.out.println("Animal is eating");
//    }
//}
//
//// Child Class 1
//class Dog extends Animal {
//
//    @Override
//    void sound() {
//        System.out.println("Dog barks...");
//    }
//}
//
//// Child Class 2
//class Cat extends Animal {
//
//    @Override
//    void sound() {
//        System.out.println("Cat meows...");
//    }
//}
//
//public class basic {
//
//    public static void main(String[] args) {
//
//        Dog d = new Dog();
//        d.sound();
//        d.eat();
//        System.out.println(" ");
//
//        Cat c = new Cat();
//        c.sound();
//        c.eat();
//    }
//}

abstract class animal{
    abstract void sound();
    void eat(){
        System.out.println("eating");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("barking");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meaow");
    }
}

public class basic{
    public static void main(String[] args) {
        animal a = new dog();
        a.sound();
        a.eat();
    }
}