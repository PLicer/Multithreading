package ThreadNameDemo;

class c extends Thread{
    public void run()
    {
        System.out.println("Thread is running by "+Thread.currentThread().getName());

    }
}


public class demo {



    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());//it is used to get the name of the thread
        Thread.currentThread().setName("Hritik");
        c thread = new c();
        thread.start();//it is used to start the name of the thread
        System.out.println("New thread name "+Thread.currentThread().getName());

        c thread1 = new c();//here we are creating the object of the class c;

        thread1.setName("Mohit");//it is used to set the name of the thread

        thread1.start();

        System.out.println(Thread.currentThread().isAlive());

        System.out.println(thread1.isAlive());//return thread is alive or not
    }
}
