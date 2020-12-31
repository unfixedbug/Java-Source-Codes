class Hi{
    public void show(){
        for(int i=1;i<=5;i++){
            System.out.println("hi");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello{
    public void show(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}


class Hi2 extends Thread{                               //Printing hi and hello,altertnately
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hi");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello2 extends Thread{                            //printing hi and hello alternatively
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{ Thread.sleep(500);} catch(Exception e){}
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        {
            // Hi obj1 = new Hi();
            // Hello obj2 = new Hello();
            // obj1.show();
            // obj2.show();
            Hi2 obj3 = new Hi2();
            Hello2 obj4 = new Hello2();
            obj3.start();
            obj4.start();
        }
    }
}
