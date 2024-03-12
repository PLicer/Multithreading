package multipleThreadSingleTask;

class a extends Thread{
    public void run()
    {
        System.out.println("Thread is running");
    }
}


public class case2 {

    public static void main(String[] args) {
        a thread=new a();
        thread.start();
        a thread1=new a();
        thread1.start();
    }
}





