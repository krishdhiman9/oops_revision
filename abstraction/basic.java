package abstraction;

abstract class animal{
    abstract void sound();
    void eat(){
        System.out.println("animal eating");
    }
}
class dog extends animal{
    dog(){ //constructor
        System.out.println("dog is very dangerous");
    }
    void sound(){
        System.out.println("barking");
    }
}

class cat extends animal{
    cat(){
        System.out.println("cat is so beautiful");
    }

    void sound(){
        System.out.println("meaowwww");
    }
}

public class basic{
    public static void main(String[] args) {
        animal a = new dog();
        a.sound();
        a.eat();

        animal b = new cat();
        b.sound();
        b.eat();
    }
}