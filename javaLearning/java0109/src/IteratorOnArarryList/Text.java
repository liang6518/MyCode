package IteratorOnArarryList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//三种遍历方法，遍历一个字符串数组
public class Text {
    public static void main(String []args){
        List<String> list=new ArrayList<String>();//尖括号里的String好像是多余的
        list.add("Hello");
        list.add("World");
        list.add("HaHaHaHa");
        for (String str:list){
            System.out.println(str);
        }
        System.out.println("\n");
        String[] strArarry=new String[list.size()];
        list.toArray(strArarry);
        for (int i=0;i<strArarry.length;i++){
            System.out.println(strArarry[i]);
        }
        System.out.println("\n");
        Iterator<String> ite=list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
