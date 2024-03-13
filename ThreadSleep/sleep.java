package ThreadSleep;

public class sleep extends Thread{

    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try{
                Thread.sleep(2000);
                System.out.println(i+" "+Thread.currentThread().getName());
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        sleep s =new sleep();
        s.start();
        sleep s1 =new sleep();
        s1.start();
    }

}
