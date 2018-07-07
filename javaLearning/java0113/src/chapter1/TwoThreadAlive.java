package chapter1;

/**
 * Java 实例 - 查看线程是否存活
 * 以下实例演示了如何通过继承 Thread 类并使用 isAlive() 方法来检测一个线程是否存活：
 */
public class TwoThreadAlive extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            printMsg();
        }
    }
    /**
     *建立一个输出信息的方法
     */
    public void printMsg(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        System.out.println("name=" +name);
    }
    /**
     * 入口，实例化上面类的对象
     */
    public static void main(String []args){
        TwoThreadAlive tt=new TwoThreadAlive();
        tt.setName("Thread");
        System.out.println("before start(), tt.isAlive()=" +tt.isAlive());
        tt.start();
        System.out.println("just after start(), tt.isAlive()=" +tt.isAlive());
        for (int i=0;i<10;i++){
            tt.printMsg();
        }
        System.out.println("The end of main(), tt.isAlive()=" +tt.isAlive());
    }
}
