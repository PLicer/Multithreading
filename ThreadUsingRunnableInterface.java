public class ThreadUsingRunnableInterface implements Runnable{

    public void run()
    {
        System.out.println("Thread is Running");
    }

    public static void main(String[] args) {
        ThreadusingThreadClass t=new ThreadusingThreadClass();
        Thread th =new Thread(t);//using runnnable interface
        th.start();
    }
}
