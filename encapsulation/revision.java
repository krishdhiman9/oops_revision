package encapsulation;
class student{
    private  int roll = 0 ;

    public void setRoll(int r){

        roll = r;
    }
    public int getRoll(){
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
