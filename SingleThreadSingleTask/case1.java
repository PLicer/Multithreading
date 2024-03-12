package SingleThreadSingleTask;

class a extends Thread{
    public void run()
    {
        System.out.println("Welcome inside the thread");
    }
}

public class case1 {
    public static void main(String[] args) {
        a thread=new a();
        thread.start();
    }
}
