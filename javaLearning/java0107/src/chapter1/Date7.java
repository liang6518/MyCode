package chapter1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date7 {
    public static void main(String []args){
        String months[] = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"};//初始化了一个数组

        int year;

        GregorianCalendar gcalendar=new GregorianCalendar();
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" "+gcalendar.get(Calendar.DATE)+" ");
        System.out.println(year = gcalendar.get(Calendar.YEAR));
        System.out.print("time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        if (gcalendar.isLeapYear(year)){
            System.out.println("当前年份是闰年");
        }
        else{
            System.out.println("不是闰年");
        }
    }
}
