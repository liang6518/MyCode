package chapter3_0;
//比较java8的新特性
import java.util.*;

public class Java8Tester {
    public static void main(String []args){
        List<String> names1=new ArrayList<>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");
        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");
        Java8Tester tester=new Java8Tester();
        System.out.println("使用 Java 7 语法: ");
        tester.sortUsingJava7(names1);
        tester.sortUsingJava8(names1);
    }
    private void sortUsingJava7(List<String> names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }
    private void sortUsingJava8(List<String> names){
        Collections.sort(names,((o1, o2) -> o1.compareTo(o2)));
    }
}
