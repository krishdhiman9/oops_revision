package encapsulation;
class student{
    private  int roll = 0 ;

    void setRoll(int r){

        roll = r;
    }
    int getRoll(){

        return roll;
    }
}
public class revision  {
    static void main() {
        student n = new student();
        n.setRoll(5);
        System.out.println(n.getRoll());
    }
}
