package polymorphism;
//method overloading
class calculator{
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a,int b,int c){
        return a+b+c;
    }
    int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

public class revision {
    public static void main() {
        calculator c = new calculator();
        System.out.println(c.sum(2,3,4,5));
    }
}

