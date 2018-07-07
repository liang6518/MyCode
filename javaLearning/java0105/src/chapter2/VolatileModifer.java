package chapter2;
//不会,下面这是网站上：通常情况下，在一个线程调用 run() 方法（在 Runnable 开启的线程），
//在另一个线程调用 stop() 方法。 如果 第一行 中缓冲区的 active 值被使用，
//那么在 第二行 的 active 值为 false 时循环不会停止。
//但是以上代码中我们使用了 volatile 修饰 active，所以该循环会停止。
public class VolatileModifer {
    private volatile boolean active;
    public void run(){
        active=true;
        while(active){//第一行

        }
    }
    public void stop(){
        active=false;//第二行
    }

}
