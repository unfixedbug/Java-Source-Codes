public class LambdaThread2 {
    public static void main(String[] args) throws Exception{
            Thread t1 = new Thread(() -> 
            {
                for(int i=1;i<=5;i++)
                        {
                            System.out.println("Hello");
                            try{ Thread.sleep(1000);} catch(Exception e){}
                        }
            });
            Thread t2 = new Thread(() ->
            {
                for(int i=1;i<=5;i++)
                        {
                            System.out.println("hi");           // or we can add this as
                            System.out.println("hi " + Thread.currentThread().getPriority());
                            try{ Thread.sleep(1000);} catch(Exception e){}
                        }
            });                                                                             
            
            
                                                                                            //priority of threads
                                                                                            // high priority =10, low prior = 1, default =5
            t1.setPriority(1);
            t2.setPriority(10);    //also we can use min max
            t1.setPriority(Thread.MIN_PRIORITY);
            t2.setPriority(Thread.MAX_PRIORITY);
            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());
                                                                                          
                                                                                            

            // are therer names of thread? can we change their name
            //this will rename the thread
            t1.setName("Hi Thread");
            t2.setName("Hello Thread");
            //tis will show the name of thread
            System.out.println(t1.getName());
            System.out.println(t2.getName());



            t1.start();
            try { Thread.sleep(10);} catch(Exception e){}
            t2.start();
            //main htread is doing nothing
            // when t1 and t2 will stop
            // t1 and t2 after excecuting will join the main thread
            // to check th state of thread
            System.out.println(t1.isAlive());   // will print wheteher the thread is alive or not 
            t1.join();
            t2.join();
            System.out.println("bye");
    }
}

                // will print same uotput as threads, lambda thread,threaddemo

