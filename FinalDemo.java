class A{
    final int i=0; // final variale declaers final
    public A(){
        // i = 10; we cannot change the value
    }
}

// also
class B{
    final int day;
    public B(){
        day = 45;
        // woax nah weve assigned the value, noww after it we cannot reassign the value
    }
}

// also if we do , no one can extend the final class
// also if we final a method, we cannot override it #overriding.java

final class C{}
// class D extends C{};//we cant do this

public class FinalDemo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i);    
    }
}
