class dog{

    }
}
class cat extends dog{
    public String namec(){
        return "luna";
    }
}



public class inheritence {
    public static void main() {
        //dog d = new dog();
        cat d = new cat();
        System.out.println(d.namec());


    }
}
