package chapter3;

import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String []args){
        List<String> name=new ArrayList<>();
        List<Integer> age=new ArrayList<>();
        List<Number> number=new ArrayList<>();
        name.add("icon");
        age.add(14);
        number.add(132);
        getData(name);
        getData(age);
        getData(number);
    }
    public static void getData(List<?> data){
        System.out.println(data.get(0));
    }
}
