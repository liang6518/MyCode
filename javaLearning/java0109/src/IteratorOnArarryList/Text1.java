package IteratorOnArarryList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
//遍历Map,通过Map.values()遍历所有的value，但不能遍历key,其余三种二者均能遍历
//容量大时推荐用第三种,所以优先选择第三种
//第19行那句话搞不明白？？？
public class Text1 {
    public static void main(String []args){
        Map<String,String> map=new HashMap<>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        System.out.println("通过Map.keySet遍历key和value：");
        for (String key:map.keySet()){
            System.out.println("key= "+key+" and value= " +map.get(key));
        }
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> ite=map.entrySet().iterator();
        while (ite.hasNext()){
            Map.Entry<String,String> entry=ite.next();
            System.out.println("key= " + entry.getKey()+" and value= " +entry.getValue());
        }
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key= "+entry.getKey()+" and value= " +entry.getValue());
        }
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v:map.values()){
            System.out.println("value= "+v);
        }
    }
}
