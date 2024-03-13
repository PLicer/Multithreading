package ThreadPriority;

public class priority extends Thread{

    public void run()
    {
        System.out.println();
        System.out.println(Thread.currentThread().getName());
        System.out.println();

        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {


        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        ThreadPriority.priority a= new priority();



        a.start();
    }

}
