class Hio implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hi");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Helloo implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{ Thread.sleep(1000);} catch(Exception e){}
        }
    }
}                                                               //reduce the number of lines using lambda expression
                                                                // in the LambdaThread.java


public class ThreadInterface {
    public static void main(String[] args) {
        {

            // also
            Runnable obj1 = new Hio();
            Runnable obj2 = new Helloo();

            // Hio obj1 = new Hio();
            // Helloo obj2 = new Helloo();
            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);
            t1.start();
            try { Thread.sleep(10);} catch(Exception e){}
            t2.start();
        }
    }
}
