//polymorphism used method overloading and method overriding.
package polymorphism;

//method overriding
class Animal {
    void sound(){
        System.out.println("meaoww");
    }
}
class dog extends Animal{
    //@Override
    void sound(){
        System.out.println("dog barking");
    }
}
class cow extends dog {
    //@Override
    void sound() {
        System.out.println("cow's sound");
    }
    }
    public class revision1 {
        public static void main() {
            Animal a = new Animal();
            dog d = new dog();
            cow c = new cow();
            a.sound();
            d.sound();
            c.sound();
        }
    }


