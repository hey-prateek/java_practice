import java.io.IOException;

public class LambdaExpressionUsingRunnable extends Thread implements Runnable{
    public static void main(String[] args) throws IOException{
        
        // Runnablee r=new Runnablee();
        // Thread t=new Thread(r);
        // t.start();
        Runnable r=()->System.out.println("inside run method...."); // this represents run method inside Runnable interface
        r.run();
    }
}

// class Runnablee implements Runnable
// {
//     public void run()
//     {
//         System.out.println("inside run method....");
//     }
// }
