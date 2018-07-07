package chapter2;
//matches整句匹配 和 lookingAt 从第一个字母匹配方法区别
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match1 {
    private static final String REGEX="foo";
    private static final String INPUT1="fooooooooooooooooo";
    private static final  String INPUT2="ooooofoooooooooooo";
    private static Pattern p;
    private static Matcher m1;
    private static Matcher m2;

    public static void main(String []args){
        p=Pattern.compile(REGEX);
        m1=p.matcher(INPUT1);
        m2=p.matcher(INPUT2);

        System.out.println("Current REGEX is: "+REGEX);
        System.out.println("Current INPUT is: "+INPUT1);
        System.out.println("Current INPUT2 is: "+INPUT2);

        System.out.println(m1.lookingAt());
        System.out.println(m1.matches());
        System.out.println(m2.lookingAt());
        System.out.println(m2.matches());
    }
}
