package YieldInMultiThreading;

public class yield extends Thread{

    public void run() {
       // Thread.yield(); if u want to stop thread 0 and run main thread continously....
        for(int i=0;i<5;i++)
        {
            System.out.println("inside the Thread"+" "+Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args)throws InterruptedException {
        yield a =new yield();

        a.start();

        //Thread.yield();//If u want to stop the main thread and give chances to another threads...

        for(int i=0;i<5;i++)
        {

            System.out.println("inside the Thread"+" "+Thread.currentThread().getName()+" "+i);
        }


    }

}
