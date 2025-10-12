public class anonymousInnerClass {
    public static void main(String[] args)
    {
        Runnable r=new Runnable(){
            public void run()
            {
                System.out.println("inside run method...");
            }
        };

        Thread t=new Thread(r);
        t.start();
    }
}
