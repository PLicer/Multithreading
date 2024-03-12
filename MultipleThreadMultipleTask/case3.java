package MultipleThreadMultipleTask;


class a extends Thread{
    public void run()
    {
        System.out.println("Thread1 is running");
    }
}

class b extends Thread{
    public void run()
    {
        System.out.println("Thread2 is running");
    }
}

class c extends Thread{
    public void run()
    {
        System.out.println("Thread3 is running");
    }
}

public class case3 {

    public static void main(String[] args) {
        a thread1=new a();
        thread1.start();
        b thread2=new b();
        thread2.start();
        c thread3 =new c();
        thread3.start();
    }

}
