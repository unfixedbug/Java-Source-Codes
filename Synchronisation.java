
class Counter{
    int count;
    // public void increment(){                //here both threads will run parrelly and the output will not be proper 
                                                 // so instead we write synch
    public synchronized void increment()
    {      //synchronised will make only one thread work at a time
        count++;
    }  
}

public class Synchronisation {
    public static void main(String[] args) throws Exception{
        Counter c = new Counter();

        c.increment();              //running thew increent method once

        Thread t1 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run()
            {
                for(int i=1;i<=1000;i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t2.join();
        t1.join();
        System.out.println("count" + c.count);
    }
}
