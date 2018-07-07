package chapter3;
//泛型类
public class GenericeClass <T>{
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public static void main(String []args){
        GenericeClass integerBox=new GenericeClass();
        GenericeClass stringBox=new GenericeClass();
        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));
        System.out.println(integerBox.get());
        System.out.println(stringBox.get());
    }
}
