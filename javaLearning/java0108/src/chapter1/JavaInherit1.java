package chapter1;

public class JavaInherit1 {
    private String name;
    private int id;
    public JavaInherit1(String myname,int myid){
        name=myname;
        id=myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introdution(){
        System.out.println("大家好！我是"+id+"号"+name);
    }
}
