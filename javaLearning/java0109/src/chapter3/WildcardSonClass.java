package chapter3;

import java.util.ArrayList;
import java.util.List;

public class WildcardSonClass {
    public static void main(String []args) {
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<Number> number = new ArrayList<>();
        name.add("sfff");
        age.add(21);
        number.add(342);
        //getUoerNumber(name);
        getData(name);
        getUoerNumber(age);
        getUoerNumber(number);
    }
    public static void getData(List<?> data){
        System.out.println(data.get(0));
    }
    public static void getUoerNumber(List<? extends Number> data){
        System.out.println(data.get(0));
    }
}
