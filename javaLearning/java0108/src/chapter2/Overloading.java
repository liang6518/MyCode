package chapter2;
//
public class Overloading {
    public int text(){
        System.out.println("test1");
        return 1;
    }
    public void text(int a){
        System.out.println("test2");
    }
    public String text(String s,int a){
        System.out.println("test3");
        return "returntest3";
    }
    public String text(int a,String s){
        System.out.println("test4");
        return "returntest4";
    }
    public static void main(String []args){
        Overloading o=new Overloading();
        System.out.println(o.text());
        o.text(1);
        System.out.println(o.text("sada",1));
        System.out.println(o.text(1,"ada"));
        //cout的存在是返回值也一起输出了
        o.text(1,"aaa");
    }
}
