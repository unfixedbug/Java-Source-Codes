class A{
    public void show(){
        System.out.println("in a shoew");
    }
}

// class B extends A{
//     @Override
//     public void show() {
//         System.out.println("im the ebdt");
//     }
// }

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()                                                 // instead of writing class b extends class A
                {                                                       // we created line 17-21
                    public void show(){                                 // anonymous class, beacus it doesnt have an name
                        System.out.println("im the best version 2");    //we cannot reuse the classs, '''one time use'''
                    }
                };
        obj.show();
    }
}
