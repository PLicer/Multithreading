public class ThreadusingThreadClass extends Thread{

    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        ThreadusingThreadClass t=new ThreadusingThreadClass();
        t.start();
        ThreadusingThreadClass t1=new ThreadusingThreadClass();
        t1.start();
    }

}

