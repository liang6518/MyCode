package chapter2;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 按指定模式在字符串查找
public class Regular2 {
    public static void main(String []args){
        String line="This order was placed for QT3000! OK?";
        String pattern="(\\D*)(\\d+)(.*)";

        Pattern r=Pattern.compile(pattern);
        Matcher m=r.matcher(line);

        if (m.find()){
            System.out.println(m.group(0));
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println(m.group(3));
        }
        else{
            System.out.println("NO MATCH");
        }

        String line1="This order was placed for QT! OK?";
        String pattern1="(\\D*)(\\d+)(.*)";

        Pattern r1=Pattern.compile(pattern1);
        Matcher m1=r1.matcher(line1);

        if (m1.find()){
            System.out.println(m1.group(0));
            System.out.println(m1.group(1));
            System.out.println(m1.group(2));
            System.out.println(m1.group(3));
        }
        else{
            System.out.println("NO MATCH");
        }
    }
}
