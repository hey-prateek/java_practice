class myThread implements Runnable
{
    public void run()
    {
        System.out.println("inside class implementing runnable interface...");
    }
}

public class threadImplementationUsingRunnableInterface {
    public static void main(String[] args)
    {
        Thread thread=new Thread(new myThread());
        thread.start();
    }
}
