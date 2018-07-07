package chapter2;

import java.util.regex.Pattern;

public class Regular1 {
    public static void main(String []args){
        String content="li xue"+"liang";
        String pattern=".*xue.*";
        boolean ismatch= Pattern.matches(pattern,content);
        System.out.println(ismatch);
    }
}
