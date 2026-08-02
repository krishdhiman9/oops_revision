package abstraction;

import javax.crypto.spec.PSource;

interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("barking");
    }
}

class Cat implements Animal{
    public void sound(){
        System.out.println("meow");
    }
}

public class Interface {
    public static void main() {
        Cat c = new Cat();
        c.sound();

        Dog d = new Dog();
        d.sound();

    }
}
