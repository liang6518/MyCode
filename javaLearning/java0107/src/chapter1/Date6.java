package chapter1;

import java.util.Calendar;

public class Date6 {
    public static void main(String []args){
        Calendar c1=Calendar.getInstance();

        int month=c1.get(Calendar.MONTH)+1;//从0开始计数
        System.out.println(month);

        int year=c1.get(Calendar.YEAR);
        System.out.println(year);
    }
}
