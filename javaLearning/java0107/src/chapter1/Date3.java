package chapter1;

import java.util.Date;
import java.util.Locale;

public class Date3 {
    public static void main(String []args){
        Date date=new Date();

        String str=String.format(Locale.CHINA,"%tb%n",date);
        System.out.println(str);

    }

}
