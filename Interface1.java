//abstract class -> define and declare
// Interface -> declare

@FunctionalInterface                           // there can be many default methods in an functional class
interface Demo{                                // but there can be onl one abstraact method in  fnctional class
    void abc();
    default void show(){                        //"""yeh hai mentoss zindagi"""
        System.out.println("in show  Demo");
    }
    // void show(){                             """yeh hai aam zindagi"""
    //     System.out.println("in show");
    // }
}
interface Mydemo{
    default void show(){                        //"""herer weve 3 show, lets eee how to print them"""
        System.out.println("in show Mydemo");
    }
}

class DemoImp implements Demo, Mydemo{
    public void abc(){
        System.out.println("in abc");
    }

    public void show(){
        System.out.println("in show demoImp");          // """overriding bhi ho jayega all because of !default! """
    }                                                      // defaultly the show method of the this class is excecuted
                                                        // to  take values of show from the interface classes we use
}

public class Interface1 {
    public static void main(String[] args) {
        Demo obj = new DemoImp();
        obj.show();
        obj.abc();                  //inheritance kr sakte hain defaultuse kr sakte hain
    }
}
