package chapter1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date4 {
    public static void main(String []args){
        SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd");

        String input = args.length == 0 ? "1818-11-11" : args[0];//不明白

        System.out.print(input+" parses as ");
        Date t;

        try {
            t=ft.parse(input);
            System.out.println(t);

        }catch (ParseException e) {
            System.out.println(ft);

        }
        //try{}catch（）语句是异常处理吗？
        System.out.println();
        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }

}
