package chapter1;
//本段代码为了说明构造方法是不能够被继承的
public class Inherit {
    public void HelloWorld(){
        System.out.println("Hello World!");
    }

    Inherit(){
    }

    public class SubClass extends Inherit{
    }

    public static void main(String []args){
        Inherit a=new Inherit();
        a.HelloWorld();
    }


}
