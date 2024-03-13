package DaemonThread;

import javax.swing.plaf.TableHeaderUI;

public class daemon extends Thread{

    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("It is a daemon thread");
            System.out.println(Thread.currentThread().getName());
        }
        else {
            System.out.println("No it is not a daemon thread");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello this is main thread");
        System.out.println();
        daemon d = new daemon();
        d.setDaemon(true); //It is use to convert thread into daemon thread
        d.start();

    }

}
