package inheritence;

class dog{
    dog(){
        System.out.println("Dog name is pitbull");
    }
}
class cat extends dog {
    cat (){
        System.out.println("cat name is luna ");
    }
}
class name extends cat {
    name(){
        System.out.println("these are names of pets.");
    }
}

public class pracQ {
    public static void main() {
        //dog object
        dog d = new dog();
//        name n = new name();
//        cat c  = new cat();
    }
}
