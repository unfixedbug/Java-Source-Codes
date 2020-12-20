class A{
    public void show(){
        System.out.println("in A");
    }

}

class B extends A{
    
    public void show(){

        System.out.println("in B");
    }
// child class method will overrite parent method

    
    
}

class C extends A{
    public void show(){
        System.out.println("in C");
    }

}

public class dynamic {
    public static void main(String[] args) {

        A obj1 = new B();
        obj1.show();
    }
}


//outpuy:
// in A
// in B

