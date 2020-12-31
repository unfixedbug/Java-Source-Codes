@FunctionalInterface
interface Demo12{
    int num=8;                                  //variable insisde a interface isa constant
    void abc();

    static void show(){
        System.out.println("HII");
    }
}

class DemoImp3 implements Demo12{
    public void abc(){
        // num = 9;                              //we cannot assignthe value beacuse it is already declared as constant 
    }
}

public class Interface2 {
    public static void main(String[] args) {
        Demo12.show();       
    }
}
