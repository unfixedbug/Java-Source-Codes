class A{
    public void show(){
        System.out.println("in A");
    }

}

// class B overrides class A
class B extends A{
    // we can use this annotations also ' @Override '
    public void show(){

        super.show(); //this will print both show() methods
        System.out.println("in B");
    }
// child class method will overrite parent method
}


public class overriding {
    public static void main(String[] args) {

        B obj1 = new B();
        obj1.show();
    }
}
