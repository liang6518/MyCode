package chapter1_0;

public class TestTread {
    public static void main(String []args){
        RunnableDemo R1=new RunnableDemo("Thread-1");
        RunnableDemo R2=new RunnableDemo("Thread-2");
        R1.start();
        R2.start();
    }
}
class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;
    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating " + threadName);
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
    public void run(){
        System.out.println("Running " +  threadName);
        try {
            for (int i=4;i>0;i--){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println(threadName);
        }
        System.out.println(threadName);
    }
}
