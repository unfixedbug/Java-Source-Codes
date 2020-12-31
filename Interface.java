//1.normal interface
//2.sam interface (1 method only) 'functional interface, single abstract method' - lambda expression 
//3.marker interface (no method)
interface DEmo{
    void sshow();
}

interface ABc{
    void show();
}

class Necessary implements ABc{
    @Override
    public void show() {
        System.out.println("anythins?");
    }
}


public class Interface {
    public static void main(String[] args) {
        // ABc obj = new ABc(){  """see there is no problem woth reference , ie  ABC obj, we have problem with new ABc""" 
        // so we create a class which implkements the interface and use the class as sown above
        // };        
    //  herer we implement the method of the interface with the help of a class;

        ABc obj = new Necessary();
        obj.show();

    // creating object of an interfaec in one line with lambda function

        DEmo obj1 = () -> System.out.println("im the best");
        obj1.sshow();
    }

}
